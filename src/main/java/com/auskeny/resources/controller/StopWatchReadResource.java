package com.auskeny.resources.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import com.auskeny.bdo.StopWatchBDO;

@Path("/stopwatch")
public class StopWatchReadResource {
	StopWatchBDO stopWatchBDO = new StopWatchBDO();

	@GET
	@Path("/start")
	public Response startWatch() {
		try {
			long response = stopWatchBDO.startTime();
			return Response.ok(response).build();
		} catch (Exception ex) {
			ex.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
		}
	}

	@GET
	@Path("/stop")
	public Response stopWatch() {
		try {
			long response = stopWatchBDO.stopTime();
			return Response.ok(response).build();
		} catch (Exception ex) {
			ex.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
		}
	}
	
	/*@GET
	@Path("/difference")
	public Response watchTimeDifference(){
		try{
			long response=stopWatchBDO.getTotalTime();
			return Response.ok(response).build();
		}catch(Exception ex){
			ex.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
		}
	}*/

}
