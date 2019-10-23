package com.dreambai.admin.bean;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by dreambai on 2017/12/19.
 */
@Data
public class Category {
	private Long id;
	private String cateName;
	private Timestamp date;

	public Category() {
	}
}
