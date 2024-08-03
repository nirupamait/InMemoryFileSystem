package com.org.entities;

public class EntityFactory {
	
	public static Entity getEntity(String name, String type, String path, String size)

	{
		if("drive".equalsIgnoreCase(type))
			{
			return new Drive( name,  type,  path,  size);
			}
		else if("folder".equalsIgnoreCase(type))
		{
		return new Folder( name,  type,  path,  size);
		}
		else if("zip".equalsIgnoreCase(type))
		{
		return new Zip( name,  type,  path,  size);
		}
		else if("text".equalsIgnoreCase(type))
		{
		return new TextFile( name,  type,  path,  size);
		}
		else {
			return null;
		}
	}
}
