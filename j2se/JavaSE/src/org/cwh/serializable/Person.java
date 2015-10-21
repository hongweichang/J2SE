package org.cwh.serializable;

import java.io.Serializable;

public class Person implements Serializable{

	private String name ;
	//private transient int age ;
	private  int age ;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		
		
		return "ĞÕÃû£º"+name+" ÄêÁä:"+age;
	}
	
	
	
}
