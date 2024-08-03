package com.org.entities;

import java.io.File;

public class Folder extends Entity{
	
private String name;
	
	private String type="";
	
	private String path="";
	
	private String size="";
	
	public Folder(String name, String type, String path, String size) {
		super(name, type, path, size);
		
	}

	public  void setSize() {
		
		File dir=new File(path);
		
		File[] directoryContents = dir.listFiles();  
		
		 for (File file : directoryContents) {  
		        // If it's a file, add its size to the total size  
		        if (file.isFile()) {  
		            size += file.length();  
		        }   
		        // If it's a directory, recursively call getDirectorySize to calculate its size  
		        else if (file.isDirectory()) {  
		            size += setSize(file);  
		        }  
		    }
		
	}

}
