package com.thingnet.model;

public class ConstructorArg {
	private Integer age;
	private String name;
	
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
	
	
	public void say(){
		System.out.println("I’m ConstructorArg instance");
	}
	
}
