package com.org.user;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import com.org.entities.Entity;
import com.org.entities.EntityFactory;

public class FileMain {
	
	
	public List<String>  listAllContents(String path)
			{
		
			}
	
	public void create(String type, String name, String path, String size)
	{
		
		Entity drive= EntityFactory.getEntity(type, name, path, size);
		 
	
		
	}
	
	public void delete(String path)
	{
		
	
		
	}
	
	
	public void  writeToFile(String path, String content)
	{
		 
	
		
	}
	
	public void move(String src, String dest)
	{

	    try {

	        Files.move(Paths.get(src), Paths.get(dest), StandardCopyOption.REPLACE_EXISTING);

	    } catch (Exception e) {

	        //log error
	     
	    }	 
	
		
	}
	

}
