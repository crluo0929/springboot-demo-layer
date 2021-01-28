package com.example.api;

public class AuthorJson {
	
	private String name ;
	
	public AuthorJson(){}
	public AuthorJson(String name){this.name = name ;}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
