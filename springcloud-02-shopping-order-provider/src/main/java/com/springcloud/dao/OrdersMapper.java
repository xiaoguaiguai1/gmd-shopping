package com.springcloud.dao;

import com.springcloud.entity.Orders;
import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders record);

    Orders selectByPrimaryKey(Integer orderId);

    List<Orders> selectAll();

    int updateByPrimaryKey(Orders record);
    
    /**
     * ��ѯORDERS�������������Ķ�����Ϣ
     * @param orders	��ѯ����
     * @return	�ɹ�����java.util.List���͵����ݣ����򷵻�null
     */
    public abstract List<Orders> selectOrders(Orders orders);
    
    /**
     * �޸�orders����ָ��ORDER_ID�Ķ���״̬
     * @param orders	�޸Ķ�������Ϣ
     * @return	�ɹ����ش���0�����������򷵻�С�ڵ���0������
     */
    public abstract Integer updateOrdersStatus(Orders orders);
    
    /**
     * ��ѯָ�����ڷ�Χ�ڵ�������
     * @param orders ��ѯ����
     * @return	�ɹ����ش���0�����������򷵻�С�ڵ���0������
     */
    public abstract List<Orders> selectGroup(Orders orders);
    
    
}