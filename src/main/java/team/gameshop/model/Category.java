package team.gameshop.model;

import java.util.Date;

/**
 * @Description:     类别
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/12 10:28
 */
public class Category {

    /**
     * 类别唯一标识id
     */
    private Integer id;

    /**
     * 类别名称
     */
    private String categoryName;

    /**
     * 类别创建者
     */
    private String createUser;

    /**
     * 类别创建时间
     */
    private Date createTime;

    /**
     * 类别更新时间
     */
    private Date updateTime;

    /**
     * 类别更新者
     */
    private String updateUser;

    /**
     * 类别删除标志 1:已删除 0:未删除
     */
    private Boolean deleteFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}