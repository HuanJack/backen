package com.xl.backen.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Menus implements Serializable {
	private static final long serialVersionUID = 9188101729579594291L;

	private String uuid;

	private String name;

	private String code;

	private Date createTime;

	private Date updateTime;

	private List<Powers> powers;

	@Override
	public String toString() {
		return "Menus{" +
				"uuid='" + uuid + '\'' +
				", name='" + name + '\'' +
				", code='" + code + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				", powers=" + powers +
				'}';
	}

	public List<Powers> getPowers() {
		return powers;
	}

	public void setPowers(List<Powers> powers) {
		this.powers = powers;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid == null ? null : uuid.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
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