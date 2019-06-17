package com.springcloud.service;

import org.springframework.data.domain.Page;

import com.springcloud.entity.Users;

/**
 * 模型层的接口：用于定义用户模块的方法
 * @author 潘兰英
 *
 */
public interface UsersService{
	/**
	 * 验证用户登录是否成功
	 * @param userId
	 * @param userPassword
	 * @param jdictionId
	 * @return	成功返回登录用户的完整信息，失败返回null
	 */
	public abstract Users login(Integer userId,String userPassword,Integer jdictionId);
	
	/**
	 * 添加新的用户信息
	 * @param users	新的用户信息
	 * @return	添加成功，返回com.springcloud.entity.Users类型的实例，否则返回null
	 */
	public abstract Page<Users> select(Users users,Integer pageNumber);

	public abstract Users insert(Users users);
	
	/**
	 * 修改USERS表中指定编号的用户状态
	 * @param userId
	 * @param userStatus
	 * @return	修改成功返回大于0的整数，否则返回0
	 */
	public abstract Integer updateStatus(Integer userId, Integer userStatus);
	
	/**
	 * 查询指定编号的用户信息
	 * @param userId
	 * @return
	 * 成功返回com.springcloud.entity.Users类型的实例，否则返回null
	 */
	public abstract Users selectById(Integer userId);
	
	/**
	 * 修改指定编号的用户信息
	 * @param users
	 * @return
	 * 修改成功返回大于0的整数，否则返回0
	 */
	public abstract Integer update(Users users);
	
	/**
	 * 根据
	 * @param users
	 * @return
	 */
	public abstract Integer updateMessage(Users users);

}
