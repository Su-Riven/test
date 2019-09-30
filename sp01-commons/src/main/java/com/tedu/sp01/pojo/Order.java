package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	/** ������ */
	private String id; 
	/** �µ��û� */
	private User user; 
	/** �µ���Ʒ */
	private List<Item> items;
}