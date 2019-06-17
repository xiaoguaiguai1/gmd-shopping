package com.springcloud.vo;

import java.util.Map;

import lombok.Data;

/**
 * ���屾��Ŀ������Controller���صĽ������
 * @author ����Ӣ
 *
 */
@Data
public class ResultValue implements java.io.Serializable{

	private static final long serialVersionUID = -7333058567132357663L;

	/*
	 * ��ʾ���õ�ǰ���ص�״̬��0��ʾ�ɹ�	1��ʾʧ��
	 */
	private Integer code;
	
	/*
	 * ���÷��ص���Ϣ
	 */
	private String message;
	
	private Map<String,Object> dataMap;
}
