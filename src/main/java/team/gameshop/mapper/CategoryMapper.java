package team.gameshop.mapper;

import java.util.List;
import team.gameshop.model.Category;
import team.gameshop.model.CategoryExample;

/**
 * @Description:     类别数据访问层
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 10:12
 */
public interface CategoryMapper {

    /**
     * 根据id 删除分类
     * @param       id
     * @return      void
     */
    public int deleteByPrimaryKey(Integer id);

    /**
     * 添加分类
     * @param       record
     * @return      int
     */
    public int insert(Category record);

    /**
     * 添加类别，字段选择性填充
     * @param       record
     * @return      int
     */
    public int insertSelective(Category record);

    /**
     * 条件查询类别
     * @param       example
     * @return      List<Category>
     */
    public List<Category> selectByExample(CategoryExample example);

    /**
     * 根据id 查询类别
     * @param       id
     * @return      Category
     */
    public Category selectByPrimaryKey(Integer id);

    /**
     * 字段选择性更新分类信息
     * @param       record
     * @return      int
     */
    public int updateByPrimaryKeySelective(Category record);

    /**
     * 字段全部更新分类信息
     * @param       record
     * @return      int
     */
    public int updateByPrimaryKey(Category record);
}