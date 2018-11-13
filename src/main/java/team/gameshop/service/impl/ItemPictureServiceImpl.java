package team.gameshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.gameshop.mapper.ItemPictureMapper;
import team.gameshop.model.Item;
import team.gameshop.model.ItemPicture;
import team.gameshop.model.ItemPictureExample;
import team.gameshop.service.ItemPictureService;

import java.util.Date;
import java.util.List;

/**
 * @Description:    商品图片业务逻辑实现层
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 14:11
 */
@Service
public class ItemPictureServiceImpl implements ItemPictureService {

    @Autowired
    ItemPictureMapper itemPictureMapper;

    @Override
    public List<ItemPicture> list(Integer itemId) {
        ItemPictureExample example = new ItemPictureExample();
        example.createCriteria().andItemIdEqualTo(itemId);
        example.setOrderByClause("id desc");
        return itemPictureMapper.selectByExample(example);
    }

    @Override
    public ItemPicture get(Integer id) {
        if (null == id){
            return null;
        }
        return itemPictureMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(ItemPicture itemPicture) {
        if (null == itemPicture){
            return 0;
        }
        itemPicture.setImagePath("admin");
        itemPicture.setCreateTime(new Date());
        itemPicture.setCreateUser("admin");
        itemPicture.setUpdateTime(new Date());
        itemPicture.setUpdateUser("admin");
        itemPicture.setDeleteFlag(false);
        itemPictureMapper.insertSelective(itemPicture);
        return itemPicture.getId();
    }

    @Override
    public int delete(Integer id) {
        if (null == id){
            return 0;
        }
        itemPictureMapper.deleteByPrimaryKey(id);
        return id;
    }

    @Override
    public int update(ItemPicture itemPicture) {
        if (null == itemPicture){
            return 0;
        }
        itemPictureMapper.updateByPrimaryKeySelective(itemPicture);
        return itemPicture.getId();
    }
}
