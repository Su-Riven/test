package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	/** 订单号 */
	private String id; 
	/** 下单用户 */
	private User user; 
	/** 下单商品 */
	private List<Item> items;
}