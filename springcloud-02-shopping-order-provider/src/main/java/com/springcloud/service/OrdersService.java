package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * ����ģ��ģ�Ͳ�Ľӿڣ����ڶ��嶩��ģ�͵ķ���
 * @author ����Ӣ
 *
 */
public interface OrdersService {

	/**
	 * ��ѯ��װ�����Ķ�����Ϣ����ҳ���ܣ�
	 * @param orders	��ѯ����
	 * @return	�ɹ�����com.github.pagehelper.PageInfo<Orders>���͵�ʵ��
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber);
	
	/**
	 * �޸�ָ����ŵĶ���״̬
	 * @param orders	�޸ĵĶ������
	 * @return	�ɹ����ش���0�����������򷵻�С�ڵ���0������
	 */
	public abstract Integer updateOrdersStatus(Orders orders);
	
	/**
	 * ��ѯָ�����ڷ�Χ�ڵ�������
	 * @param orders ��ѯ����
	 * @return	�ɹ�����java.util.List���͵����ݣ����򷵻�null
	 */
	public abstract List<Orders> selectGroup(Orders orders);
}
