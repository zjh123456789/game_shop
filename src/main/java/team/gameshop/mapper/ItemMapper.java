package team.gameshop.mapper;

import java.util.List;
import team.gameshop.model.Item;
import team.gameshop.model.ItemExample;

/**
 * @Description:     商品数据访问层
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 10:21
 */
public interface ItemMapper {

    /**
     * 根据id 删除商品
     * @param       id
     * @return      void
     */
    public int deleteByPrimaryKey(Integer id);

    /**
     * 添加商品
     * @param       record
     * @return      int
     */
    public int insert(Item record);

    /**
     * 添加商品，字段选择性填充
     * @param       record
     * @return      int
     */
    public int insertSelective(Item record);

    /**
     * 条件查询商品
     * @param       example
     * @return      List<Category>
     */
     public List<Item> selectByExample(ItemExample example);

    /**
     * 根据id 查询商品
     * @param       id
     * @return      Category
     */
    public Item selectByPrimaryKey(Integer id);

    /**
     * 字段选择性更新商品图片
     * @param       record
     * @return      int
     */
    public int updateByPrimaryKeySelective(Item record);

    /**
     * 字段全部更新商品图片
     * @param       record
     * @return      int
     */
    public int updateByPrimaryKey(Item record);
}