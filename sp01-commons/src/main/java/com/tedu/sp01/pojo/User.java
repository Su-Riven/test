package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	/** �û�id */
	private Integer id; 
	/** �û��� */
	private String username; 
	/** �û����� */
	private String password;
}