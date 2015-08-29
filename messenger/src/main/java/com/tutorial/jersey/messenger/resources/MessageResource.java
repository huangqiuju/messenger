package com.tutorial.jersey.messenger.resources;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import com.tutorial.jersey.messenger.model.Message;
import com.tutorial.jersey.messenger.service.MessageService;
@Path("/messages")
public class MessageResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage()
	{
	// business servie bean
	MessageService msgService=new MessageService();
	
	//retrive model from database
	List<Message> model=msgService.getAllMessages();
		
	//String out="hello";			
	//Response resp=Response.ok(out).build();
	return model;
	
	
	}

}
