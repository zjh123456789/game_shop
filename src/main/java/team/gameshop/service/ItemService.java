package team.gameshop.service;

import team.gameshop.model.Item;

import java.util.List;

/**
 * @Description:    商品业务逻辑接口
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 13:59
 */
public interface ItemService {

    /**
     * 查询所有商品
     * @param
     * @return
     */
    public List<Item> list();

    /**
     * 根据id 获取商品
     * @param       id
     * @return      Item
     */
    public Item get(Integer id);

    /**
     * 添加商品
     * @param       item
     * @return      int
     */
    public int add(Item item);

    /**
     * 根据id 删除商品
     * @param       id
     * @return      int
     */
    public int delete(Integer id);

    /**
     * 更新商品信息
     * @param       item
     * @return      int
     */
    public int update(Item item);

}
