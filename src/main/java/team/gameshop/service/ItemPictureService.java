package team.gameshop.service;

import team.gameshop.model.ItemPicture;

import java.util.List;

/**
 * @Description:    商品图片业务逻辑接口
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 14:12
 */
public interface ItemPictureService {

    /**
     * 根据商品查找对应图片
     * @param       itemId
     * @return      List<ItemPicture>
     */
    public List<ItemPicture> list(Integer itemId);

    /**
     * 根据id 查找商品图片
     * @param       id
     * @return      ItemPicture
     */
    public ItemPicture get(Integer id);

    /**
     * 添加商品图片
     * @param       itemPicture
     * @return      int
     */
    public int add(ItemPicture itemPicture);

    /**
     * 根据id 删除商品图片
     * @param       id
     * @return      int
     */
    public int delete(Integer id);

    /**
     * 更新商品图片
     * @param       itemPicture
     * @return      int
     */
    public int update(ItemPicture itemPicture);

}
