package com.auskeny.application;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class ResourceApplication extends Application{
	@Override
	public Set<Class<?>> getClasses(){
		System.out.println("in Application");
		Set<Class<?>> resources = new java.util.HashSet<>();
		resources.add(com.auskeny.resources.controller.CurrentServerDateTimeReadResource.class);
		resources.add(com.auskeny.resources.controller.StopWatchReadResource.class);
		return resources;
		
	}
}
