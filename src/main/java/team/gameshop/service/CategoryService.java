package team.gameshop.service;

import team.gameshop.model.Category;

import java.util.List;

/**
 * @Description:     类别业务逻辑层
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/10 10:05
 */
public interface CategoryService {

    /**
     * 搜索所有分类
     * @param
     * @return  分类集合
     */
    public List<Category> list();

    /**
     * 根据id查询类别
     * @param       id
     * @return      Category
     */
    public Category get(Integer id);

    /**
     * 添加分类
     * @param       category
     * @return      void
     */
    public int add(Category category);

    /**
     * 删除分类(模拟)
     * @param       id
     * @return      void
     */
    public int delete(Integer id);

    /**
     * 修改分类信息
     * @param       category
     * @return      int
     */
    public int update(Category category);
}
