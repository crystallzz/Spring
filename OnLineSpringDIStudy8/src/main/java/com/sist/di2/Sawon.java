package com.sist.di2;

import org.springframework.stereotype.Component;

@Component("sa")
public class Sawon {
	private String name="��û";
	private String dept="����";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
