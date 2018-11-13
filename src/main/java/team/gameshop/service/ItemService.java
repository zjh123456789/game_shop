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

    /**
     * 设置商品展示图片
     * @param           item
     * @return          void
     */
    public void setShowItemImage(Item item);

    /**
     *  根据分类ID查询商品
     * @param       categoryId
     * @return      List<Item>
     */
    public List<Item> listByCategory(Integer categoryId);

    /**
     * 按关键字搜索商品
     * @param       name
     * @return      List<Item>
     */
    public List<Item> listByKeyWord(String name);

    /**
     * 搜索英雄对应的全部皮肤
     * @param       id
     * @return      List<Item>
     */
    public List<Item> listSkinByHero(Integer id);

    /**
     * 按销量查询商品
     * @param
     * @return
     */
    public List<Item> listItemBySaleNumber();

    /**
     * 查询最新商品
     * @param
     * @return
     */
    public List<Item> listItemByNewDate();
}
