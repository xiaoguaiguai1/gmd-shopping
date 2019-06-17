package com.springcloud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * USERS���Ӧ��ʵ���࣬���ڷ�װUSERS����һ���û���Ϣ
 * @author ����Ӣ
 *
 */
@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements java.io.Serializable{
	
	
	private static final long serialVersionUID = -8301214497854454201L;
	/*
	 * �û����
	 */
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //������
	private Integer userId;	
	/*
	 * �û�����
	 */
	@Column(name = "user_name")
	private String userName;
	/*
	 * �û����֤��
	 */
	@Column(name = "user_number")
	private String userNumber;
	/*
	 * �û�����
	 */
	@Column(name = "user_password")
	private String userPassword;
	/*
	 * �û��Ա�0��	1Ů
	 */
	@Column(name = "user_sex")
	private Integer userSex;
	/*
	 * �û���ϵ�绰
	 */
	@Column(name = "user_phone")
	private String userPhone;
	/*
	 * �û��ջ���ַ
	 */
	@Column(name = "user_site")
	private String userSite;
	/*
	 * �û��������� :yyyy-MM-dd
	 */
	@Column(name = "user_birthday")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userBirthday;
	/*
	 * �û�����
	 */
	@Column(name = "user_email")
	private String userEmail;
	/*
	 * �û�ͷ��
	 */
	@Column(name = "user_photo")
	private String userPhoto;
	/*
	 * �û�Ȩ�ޣ�1Ϊ��������	2Ϊ��ͨ����Ա	3ΪVIP�û�
	 */
	@Column(name = "jdiction_id")
	private Integer jdictionId;
	/*
	 * �û�״̬��0Ϊ����	1Ϊ����
	 */
	@Column(name = "user_status")
	private Integer userStatus;
	
}
