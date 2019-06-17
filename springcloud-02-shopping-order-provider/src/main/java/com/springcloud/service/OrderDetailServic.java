package com.springcloud.service;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.OrderDetail;

/**
 * ������ϸģ��ģ�Ͳ�Ľӿڣ����ڶ��嶩����ϸģ��ķ���
 * @author ����Ӣ
 *
 */
public interface OrderDetailServic {

	/**
	 * ��ѯָ��������ŵĶ�����ϸ��Ϣ����ҳ���ܣ�
	 * 
	 * @param orderId	�������
	 * @return ����com.github.pagehelper.PageInfo<OrderDetail>���͵�ʵ��
	 */
	public abstract PageInfo<OrderDetail> selectByOrderId(Integer orderId, Integer pageNumber);

	
}
