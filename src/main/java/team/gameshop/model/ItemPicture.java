package team.gameshop.model;

import java.util.Date;

/**
 * @Description:     商品图片
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 10:29
 */
public class ItemPicture {

    /**
     * 商品图片唯一标识id
     */
    private Integer id;

    /**
     * 商品ID
     */
    private Integer itemId;

    /**
     * 图片路径
     */
    private String imagePath;

    /**
     * 商品图片创建者
     */
    private String createUser;

    /**
     * 商品图片创建时间
     */
    private Date createTime;

    /**
     * 商品图片更新者
     */
    private String updateUser;

    /**
     * 商品图片更新时间
     */
    private Date updateTime;

    /**
     * 商品图片删除标志 1:删除 0:未删除
     */
    private Boolean deleteFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
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
}