package com.springcloud.dao;

import com.springcloud.entity.OrderDetail;
import java.util.List;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orderDetailId);

    List<OrderDetail> selectAll();

    int updateByPrimaryKey(OrderDetail record);
    
    /**
	 * ��ѯָ��������ŵĶ�����ϸ��Ϣ
	 * @param orderId
	 * @return	�ɹ�����java.util.Lis���͵�ʵ�������򷵻�null
	 */
	public abstract List<OrderDetail> selectByOrderId(Integer orderId);
}