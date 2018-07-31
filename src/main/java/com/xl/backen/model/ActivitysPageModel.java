package com.xl.backen.model;

import com.xl.backen.entity.Activitys;

/**
 * ActivitysPageModel
 */
public class ActivitysPageModel extends Activitys {

  private static final long serialVersionUID = 1L;

  private int pageSize;

  private int pageNum;

  private Integer flag;

	@Override
	public String toString() {
		return "{" +
			" pageSize='" + getPageSize() + "'" +
			", pageNum='" + getPageNum() + "'" +
			", flag='" + getFlag() + "'" +
			"}";
	}



	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

}