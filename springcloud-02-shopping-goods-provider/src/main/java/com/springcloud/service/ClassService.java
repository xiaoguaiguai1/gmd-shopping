package com.springcloud.service;

import java.util.List;

import com.springcloud.entity.Class1;
import com.springcloud.entity.Class2;

/**
 * 用于定义一级类别和二级类别模块的方法
 * @author 潘兰英
 *
 */
public interface ClassService {

	/**
	 * 查询所有一级类别的信息
	 * @return
	 */
	public abstract List<Class1> selectAllClass1();
	
	/**
	 * 根据一级类别编号查询相应的二级类别信息
	 * @param class1Id
	 * 成功返回java.util.List类型的实例，否则返回null
	 */
	public abstract List<Class2> selectClass2ByClass1Id(Integer class1Id);
	
}
