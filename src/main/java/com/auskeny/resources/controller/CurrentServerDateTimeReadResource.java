package com.auskeny.resources.controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.auskeny.bdo.ServerDateTimeBDO;

@Path("/currentserver")
public class CurrentServerDateTimeReadResource {

	@GET
	@Path("/datetime")	
	//@Produces(MediaType.APPLICATION_JSON)
	public Response returnCurrentServerTime(){
		try {
			System.out.println("getserverTime");
			String responseData = new ServerDateTimeBDO().getCurrentServerDateTime();
			System.out.println(responseData);
			return Response.ok(responseData).build();			
		} catch (Exception ex) {
			ex.printStackTrace();			
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
		}		
	}
	
	
}
