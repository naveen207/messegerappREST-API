package org.naveen.javabrains.RESTful.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.naveen.javabrains.RESTful.messenger.model.Message;
import org.naveen.javabrains.RESTful.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
     
	MessageService messageservice= new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		return messageservice.getAllMessages();
	}
    
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageid}")
	public Message getMessage(@PathParam("messageid") long id){
		return messageservice.getMessage(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Message addMessage(Message message){
		return messageservice.addMessage(message);
	}
}
