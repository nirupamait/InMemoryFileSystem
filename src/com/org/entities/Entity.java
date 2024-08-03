package com.org.entities;

public abstract class Entity {
	
	public abstract void setSize();
	
	
	private String name;
	
	private String type="";
	
	private String path="";
	
	private String size="";
	
	public Entity(String name, String type, String path, String size)
	{
		this.name=name;
		this.type=type;
		this.path=path;
		this.size=size;
	}

}
