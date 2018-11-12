package team.gameshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.gameshop.mapper.CategoryMapper;
import team.gameshop.mapper.ItemMapper;
import team.gameshop.model.Category;
import team.gameshop.model.Item;
import team.gameshop.model.ItemExample;
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

    @Override
    public List<Item> list() {
        ItemExample example = new ItemExample();
        example.createCriteria().andDeleteFlagEqualTo(false);
        example.setOrderByClause("id desc");
        List<Item> items = itemMapper.selectByExample(example);
        setCategory(items);
        return items;
    }

    @Override
    public Item get(Integer id) {
        if (null == id){
            return null;
        }
        return itemMapper.selectByPrimaryKey(id);
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
