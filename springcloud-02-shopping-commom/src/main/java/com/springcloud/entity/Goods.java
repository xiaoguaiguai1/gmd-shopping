package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	/**
	 * ��Ʒ���
	 */
    private Integer goodsId;

    /**
	 * ��Ʒ����
	 */
    private String goodsName;

    /**
	 * ��Ʒ�۸�
	 */
    private Double goodsPrices;

    /**
	 * ��Ʒ�ۿ�
	 */
    private Double goodsDiscount;
    
    /**
	 * ��Ʒ״̬��0Ϊ�ϼܣ�1Ϊ�¼�
	 */
    private Integer goodsStatus;

    /**
	 * ��Ʒ����
	 */
    private Integer goodsCount;

    /**
	 * �Ƿ���Ʒ��0Ϊ��Ʒ��1Ϊ����Ʒ
	 */
    private Integer goodsIsNew;

    /**
	 * �Ƿ�������0Ϊ������1Ϊ������
	 */
    private Integer goodsIsHot;

    /**
	 * ��Ʒ�ȼ���0Ϊһ�ǣ�1Ϊ���ǣ�2Ϊ���ǣ�3Ϊ���ǣ�4Ϊ����
	 */
    private Integer goodsLevel;

    /**
	 * ��Ʒ���
	 */
    private String goodsBrief;
    /**
	 * ��Ʒ����
	 */
    private String goodsDetails;

    /**
	 * ��ƷͼƬ
	 */
    private String goodsPhoto;

    /**
	 * �������
	 */
    private Integer class2Id;
    
    /**
     * ��ѯ��������Ʒ�۸�����
     */
    private Double goodsPriceMin;
    
    /**
     * ��ѯ��������Ʒ�۸�����
     */
    private Double goodsPriceMax;
    
    /**
     * ��ѯ���������һ���
     */
    private Integer class1Id;
    
    /**
     * ��Ʒ���������ڱ���ͳ�Ʒ���Ľ��
     */
    private Integer goodsSum;

   
}