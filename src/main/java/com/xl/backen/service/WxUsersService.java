package com.xl.backen.service;

import com.xl.backen.entity.Peoples;

/**
 * 微信用户服务
 */
public interface WxUsersService {
	/**
	 * APP端登录
	 * @param
	 * @return
	 */
	Peoples login(Peoples peoples);

	/**
	 * APP端实名认证
	 */
	int authentication(Peoples peoples);
}
