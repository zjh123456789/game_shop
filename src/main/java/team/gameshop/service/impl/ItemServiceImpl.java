package team.gameshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.gameshop.mapper.CategoryMapper;
import team.gameshop.mapper.ItemMapper;
import team.gameshop.model.Category;
import team.gameshop.model.Item;
import team.gameshop.model.ItemExample;
import team.gameshop.model.ItemPicture;
import team.gameshop.service.ItemPictureService;
import team.gameshop.service.ItemService;

import java.util.Date;
import java.util.List;

/**
 * @Description:   商品业务逻辑实现层
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 14:06
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemMapper itemMapper;
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    ItemPictureService itemPictureService;

    @Override
    public List<Item> list() {
        ItemExample example = new ItemExample();
        example.createCriteria().andDeleteFlagEqualTo(false);
        example.setOrderByClause("id desc");
        List<Item> items = itemMapper.selectByExample(example);
        setShowItemImage(items);
        setCategory(items);
        return items;
    }

    @Override
    public Item get(Integer id) {
        if (null == id){
            return null;
        }
        Item item = itemMapper.selectByPrimaryKey(id);
        setShowItemImage(item);
        setCategory(item);
        return item;
    }

    @Override
    public int add(Item item) {
        if (null == item){
            return 0;
        }
        item.setCreateUser("admin");
        item.setCreateTime(new Date());
        item.setUpdateTime(new Date());
        item.setUpdateUser("admin");
        item.setDeleteFlag(false);
        item.setKeyword("刺客");
        item.setAppraiseNumber(0);
        item.setIsSale(true);
        item.setSaleNumber(0);
        itemMapper.insertSelective(item);
        return item.getId();
    }

    @Override
    public int delete(Integer id) {
        if (null == id){
            return 0;
        }
        Item item = itemMapper.selectByPrimaryKey(id);
        item.setDeleteFlag(true);
        itemMapper.updateByPrimaryKeySelective(item);
        return id;
    }

    @Override
    public int update(Item item) {
        if (null == item){
            return 0;
        }
        itemMapper.updateByPrimaryKeySelective(item);
        return item.getId();
    }

    @Override
    public void setShowItemImage(Item item) {
        List<ItemPicture> itemPictures = itemPictureService.list(item.getId());
        if (!itemPictures.isEmpty()){
            ItemPicture itemPicture = itemPictures.get(0);
            item.setShowPicture(itemPicture);
        }
    }

    @Override
    public List<Item> listByCategory(Integer categoryId) {
        ItemExample example = new ItemExample();
        example.createCriteria().andCategoryIdEqualTo(categoryId);
        example.setOrderByClause("id desc");
        return itemMapper.selectByExample(example);
    }

    @Override
    public List<Item> listByKeyWord(String name) {
        ItemExample example = new ItemExample();
        example.createCriteria().andKeywordLike("%" + name + "%");
        return itemMapper.selectByExample(example);
    }

    @Override
    public List<Item> listSkinByHero(Integer id) {
        ItemExample example = new ItemExample();
        example.createCriteria().andOriginalHeroIdEqualTo(id);
        return itemMapper.selectByExample(example);
    }

    @Override
    public List<Item> listItemBySaleNumber() {
        ItemExample example = new ItemExample();
        example.setOrderByClause("sale_number desc");
        return itemMapper.selectByExample(example);
    }

    @Override
    public List<Item> listItemByNewDate() {
        ItemExample example = new ItemExample();
        example.setOrderByClause("create_time desc");
        return itemMapper.selectByExample(example);
    }

    public void setShowItemImage(List<Item> items){
        for (Item item : items){
            setShowItemImage(item);
        }
    }

    public void setCategory(Item item){
        Category category = categoryMapper.selectByPrimaryKey(item.getCategoryId());
        item.setCategory(category);
    }

    public void setCategory(List<Item> items){
        for (Item item : items){
            setCategory(item);
        }
    }
}
