package com.hc.po;

import com.hc.demo1.Aaa;

@Aaa("dfsafdak")
public class Person {
	String name;
	int age;

	// @Aaa(name=Person.class, str={"tom", "Will"})
	// @Aaa(name=Person.class, str="tom")
	// @Aaa(value = "javaaaa", max=100)
	@Aaa({"javaaaa", "dsafsaf"})
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void doit() {
		int i = 100;
		System.out.println(Math.PI);
	}

	@Deprecated
	// 过时了
	public void show() {
		System.out.println("dskafdjak");
	}

}
