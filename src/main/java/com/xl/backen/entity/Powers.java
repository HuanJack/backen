package com.xl.backen.entity;

import java.util.Date;

public class Powers {
    private String uuid;

    private String code;

    private String meunName;

    private String description;

    private Date createTime;

    private Date updateTime;

    private String upMenusId;

    private String upMenusName;

    public String getUpMenusId() {
        return upMenusId;
    }

    public void setUpMenusId(String upMenusId) {
        this.upMenusId = upMenusId;
    }

    public String getUpMenusName() {
        return upMenusName;
    }

    public void setUpMenusName(String upMenusName) {
        this.upMenusName = upMenusName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getMeunName() {
        return meunName;
    }

    public void setMeunName(String meunName) {
        this.meunName = meunName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
}