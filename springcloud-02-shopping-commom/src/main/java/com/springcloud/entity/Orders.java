package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDERS���Ӧ��ʵ���࣬���ڷ�װһ�ж�����Ϣ
 * 
 * @author ����Ӣ
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = -8209481776583667474L;

	/**
	 * �������
	 */
	private Integer orderId;

	/**
	 * ��ǰ�������û���Ϣ
	 */
	private Users user;

	/**
	 * �ջ������������ʡ��Ĭ��Ϊ�û����е��û�����
	 */
	private String consigneeName;

	/**
	 * �ջ��˵绰
	 */
	private String consigneeNumber;

	/**
	 * �ջ���ַ
	 */
	private String consigneeSite;

	/**
	 * �µ�ʱ��
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderTime;

	/**
	 * �����ܶ�
	 */
	private Double orderAmount;

	/**
	 * ����״̬��0Ϊ������ ��1Ϊ��������2������
	 */
	private Integer orderStatus;
	
	/**
	 * ��ѯ������������ʼʱ��
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMin;
	
	/**
	 * ����������������ֹʱ��
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMax;
	
	/**
	 * ��ѯ��������ʼ������
	 */
	private String startMonth;
	
	/**
	 * ��ѯ��������ֹ������
	 */
	private String endMonth;
	
	/**
	 * ͳ�ƽ��������
	 */
	private String orderMonth;
	
	/**
	 * ͳ�ƽ�������۶�
	 */
	private Double orderPrice;

}