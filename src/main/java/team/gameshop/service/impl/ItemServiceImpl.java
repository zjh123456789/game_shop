package team.gameshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.gameshop.mapper.ItemMapper;
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

    @Override
    public List<Item> list() {
        ItemExample example = new ItemExample();
        example.setOrderByClause("id desc");
        return itemMapper.selectByExample(example);
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
        itemMapper.insertSelective(item);
        return item.getId();
    }

    @Override
    public int delete(Integer id) {
        if (null == id){
            return 0;
        }
        itemMapper.deleteByPrimaryKey(id);
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
}
