package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.OrderDetail;
import com.springcloud.service.OrderDetailServic;
import com.springcloud.vo.ResultValue;

/**
 * ������ϸģ��Ŀ��Ʋ�
 * @author ����Ӣ
 *
 */
@RestController
@RequestMapping(value="orderDetail")
public class OrderDetailController {

	@Autowired
	private OrderDetailServic orderDetailServic;
	
	@RequestMapping(value="/selectByOrderId")
	public ResultValue selectByOrderId(@RequestParam("orderId") Integer orderId,@RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();
		
		try {
			PageInfo<OrderDetail> pageInfo = this.orderDetailServic.selectByOrderId(orderId,pageNumber);
			List<OrderDetail> list = pageInfo.getList();
			if(list != null && list.size() > 0) {
				rv.setCode(0);
				Map<String,Object> map = new HashMap<>();
				map.put("orderDetailList", list);
				
				PageUtils pageUtils = new PageUtils(5,pageInfo.getPages() * 5);
				pageUtils.setPageNumber(pageNumber);
				map.put("pageUtils", pageUtils);
				
				rv.setDataMap(map);
				return rv;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("û�в��鵽���������Ķ�����ϸ��Ϣ����");
		return rv;
	}
}
