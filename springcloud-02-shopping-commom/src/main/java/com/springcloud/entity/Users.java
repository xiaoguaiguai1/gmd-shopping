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
 * USERS表对应的实体类，用于封装USERS表中一行用户信息
 * @author 潘兰英
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
	 * 用户编号
	 */
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //自增长
	private Integer userId;	
	/*
	 * 用户姓名
	 */
	@Column(name = "user_name")
	private String userName;
	/*
	 * 用户身份证号
	 */
	@Column(name = "user_number")
	private String userNumber;
	/*
	 * 用户密码
	 */
	@Column(name = "user_password")
	private String userPassword;
	/*
	 * 用户性别：0男	1女
	 */
	@Column(name = "user_sex")
	private Integer userSex;
	/*
	 * 用户联系电话
	 */
	@Column(name = "user_phone")
	private String userPhone;
	/*
	 * 用户收货地址
	 */
	@Column(name = "user_site")
	private String userSite;
	/*
	 * 用户出生日期 :yyyy-MM-dd
	 */
	@Column(name = "user_birthday")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userBirthday;
	/*
	 * 用户邮箱
	 */
	@Column(name = "user_email")
	private String userEmail;
	/*
	 * 用户头像
	 */
	@Column(name = "user_photo")
	private String userPhoto;
	/*
	 * 用户权限：1为超级管理	2为普通管理员	3为VIP用户
	 */
	@Column(name = "jdiction_id")
	private Integer jdictionId;
	/*
	 * 用户状态：0为可用	1为禁用
	 */
	@Column(name = "user_status")
	private Integer userStatus;
	
}
