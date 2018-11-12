package team.gameshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.gameshop.mapper.CategoryMapper;
import team.gameshop.model.Category;
import team.gameshop.model.CategoryExample;
import team.gameshop.service.CategoryService;

import java.util.Date;
import java.util.List;

/**
 * @Description:    类别业务逻辑实现层
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/10 10:07
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        CategoryExample example = new CategoryExample();
        example.createCriteria().andDeleteFlagEqualTo(false);
        example.setOrderByClause("id desc");
        return categoryMapper.selectByExample(example);
    }

    @Override
    public Category get(Integer id) {
        if (null == id){
            return null;
        }
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Category category) {
        if (null == category){
            return 0;
        }
        category.setDeleteFlag(false);
        category.setCreateUser("admin");
        category.setCreateTime(new Date());
        category.setUpdateTime(new Date());
        category.setUpdateUser("admin");
        categoryMapper.insertSelective(category);
        return category.getId();
    }

    @Override
    public int delete(Integer id) {
        if (null == id){
            return 0;
        }
        Category category = categoryMapper.selectByPrimaryKey(id);
        category.setDeleteFlag(true);
        categoryMapper.updateByPrimaryKeySelective(category);
        return id;
    }

    @Override
    public int update(Category category) {
        if (null == category){
            return 0;
        }
        category.setUpdateTime(new Date());
        categoryMapper.updateByPrimaryKeySelective(category);
        return category.getId();
    }

}
