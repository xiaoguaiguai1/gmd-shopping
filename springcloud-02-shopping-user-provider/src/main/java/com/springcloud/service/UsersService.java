package com.springcloud.service;

import org.springframework.data.domain.Page;

import com.springcloud.entity.Users;

/**
 * ģ�Ͳ�Ľӿڣ����ڶ����û�ģ��ķ���
 * @author ����Ӣ
 *
 */
public interface UsersService{
	/**
	 * ��֤�û���¼�Ƿ�ɹ�
	 * @param userId
	 * @param userPassword
	 * @param jdictionId
	 * @return	�ɹ����ص�¼�û���������Ϣ��ʧ�ܷ���null
	 */
	public abstract Users login(Integer userId,String userPassword,Integer jdictionId);
	
	/**
	 * ����µ��û���Ϣ
	 * @param users	�µ��û���Ϣ
	 * @return	��ӳɹ�������com.springcloud.entity.Users���͵�ʵ�������򷵻�null
	 */
	public abstract Page<Users> select(Users users,Integer pageNumber);

	public abstract Users insert(Users users);
	
	/**
	 * �޸�USERS����ָ����ŵ��û�״̬
	 * @param userId
	 * @param userStatus
	 * @return	�޸ĳɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer updateStatus(Integer userId, Integer userStatus);
	
	/**
	 * ��ѯָ����ŵ��û���Ϣ
	 * @param userId
	 * @return
	 * �ɹ�����com.springcloud.entity.Users���͵�ʵ�������򷵻�null
	 */
	public abstract Users selectById(Integer userId);
	
	/**
	 * �޸�ָ����ŵ��û���Ϣ
	 * @param users
	 * @return
	 * �޸ĳɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer update(Users users);
	
	/**
	 * ����
	 * @param users
	 * @return
	 */
	public abstract Integer updateMessage(Users users);

}
