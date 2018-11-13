package team.gameshop.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description:     商品
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 10:29
 */
public class Item {

    /**
     * 商品唯一标识ID
     */
    private Integer id;

    /**
     * 类别ID
     */
    private Integer categoryId;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 商品原价
     */
    private BigDecimal originalPrice;

    /**
     * 商品现价
     */
    private BigDecimal currentPrice;

    /**
     * 商品库存
     */
    private Integer stock;

    /**
     * 商品创建者
     */
    private String createUser;

    /**
     * 商品创建时间
     */
    private Date createTime;

    /**
     * 商品更新者
     */
    private String updateUser;

    /**
     * 商品更新时间
     */
    private Date updateTime;

    /**
     * 商品删除标志 1:删除 0:未删除
     */
    private Boolean deleteFlag;

    /**
     * 商品关键字
     */
    private String keyword;

    /**
     * 商品上架标志 1:上架 0:下架
     */
    private Boolean isSale;

    /**
     * 评价数量
     */
    private Integer appraiseNumber;

    /**
     * 销售量
     */
    private Integer saleNumber;

    /**
     * 原始英雄ID
     */
    private Integer originalHeroId;

    /**
     * 商品描述
     */
    private String itemDescription;

    /**
     * 商品类别
     */
    private Category category;

    /**
     * 展示图片
     */
    private ItemPicture showPicture;

    public ItemPicture getShowPicture() {
        return showPicture;
    }

    public void setShowPicture(ItemPicture showPicture) {
        this.showPicture = showPicture;
    }

    public Boolean getSale() {
        return isSale;
    }

    public void setSale(Boolean sale) {
        isSale = sale;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Boolean getIsSale() {
        return isSale;
    }

    public void setIsSale(Boolean isSale) {
        this.isSale = isSale;
    }

    public Integer getAppraiseNumber() {
        return appraiseNumber;
    }

    public void setAppraiseNumber(Integer appraiseNumber) {
        this.appraiseNumber = appraiseNumber;
    }

    public Integer getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(Integer saleNumber) {
        this.saleNumber = saleNumber;
    }

    public Integer getOriginalHeroId() {
        return originalHeroId;
    }

    public void setOriginalHeroId(Integer originalHeroId) {
        this.originalHeroId = originalHeroId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription == null ? null : itemDescription.trim();
    }
}