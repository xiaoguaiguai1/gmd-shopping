package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * order_detail���Ӧ��ʵ���࣬���ڷ�װһ�ж�����Ϣ
 * 
 * @author ����Ӣ
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail implements java.io.Serializable {

	private static final long serialVersionUID = -7405309828011124128L;

	/**
	 * ������ϸ���
	 */
	private Integer orderDetailId;

	/**
	 * �������
	 */
	private Integer orderId;

	/**
	 * ��Ʒ���
	 */
	private Integer goodsId;

	/**
	 * ��Ʒ����
	 */
	private String goodsName;

	/**
	 * �ɽ���
	 */
	private Double transactionPrice;

	/**
	 * �ɽ�����
	 */
	private Integer transactionCount;

}