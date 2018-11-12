package team.gameshop.mapper;

import java.util.List;
import team.gameshop.model.ItemPicture;
import team.gameshop.model.ItemPictureExample;

/**
 * @Description:     商品图片数据访问层
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 10:18
 */
public interface ItemPictureMapper {

    /**
     * 根据id 删除商品图片
     * @param       id
     * @return      void
     */
    public int deleteByPrimaryKey(Integer id);

    /**
     * 添加商品图片
     * @param       record
     * @return      int
     */
    public int insert(ItemPicture record);

    /**
     * 添加商品图片，字段选择性填充
     * @param       record
     * @return      int
     */
    public int insertSelective(ItemPicture record);

    /**
     * 条件查询商品图片
     * @param       example
     * @return      List<Category>
     */
    public List<ItemPicture> selectByExample(ItemPictureExample example);

    /**
     * 根据id 查询商品图片
     * @param       id
     * @return      Category
     */
    public ItemPicture selectByPrimaryKey(Integer id);

    /**
     * 字段选择性更新商品图片信息
     * @param       record
     * @return      int
     */
    public int updateByPrimaryKeySelective(ItemPicture record);

    /**
     * 字段全部更新商品图片信息
     * @param       record
     * @return      int
     */
    public int updateByPrimaryKey(ItemPicture record);
}