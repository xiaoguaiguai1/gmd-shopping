package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * class2���Ӧ��ʵ���࣬���ڱ����
 * @author ����Ӣ
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class2 {
	
	/**
	 * �������
	 */
    private Integer class2Id;

    /**
	 * ��������
	 */
    private String class2Name;

    /**
	 * ���
	 */
    private Integer class1Id;

    /**
	 * ��ע
	 */
    private String remark;

   
}