package com.org.entities;

import java.util.HashMap;

public class FileNode {
	
	String name;
	
	HashMap<String,FileNode>  childNode;
	
	public FileNode(String name)
	{
		this.name=name;
		childNode=new HashMap<>();
	}

}
