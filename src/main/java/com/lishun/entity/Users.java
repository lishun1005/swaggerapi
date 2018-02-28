package com.lishun.entity;

/**
 * @author lishun
 * @Description: TODO
 * @date 2018/2/28
 */
public class Users {
	private String Id;
	private Integer age;
	private String name;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
