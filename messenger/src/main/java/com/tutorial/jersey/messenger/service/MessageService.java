package com.tutorial.jersey.messenger.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.tutorial.jersey.messenger.model.Message;

public class MessageService {
	
	private List <Message> messageList=new ArrayList<Message>();
	
	public MessageService()
	{
		Message m1=new Message(1, "hello from qiuju", "qiuju");
		Message m2=new Message(1, "hello from kevin", "kevin");
		add(m1);
		add(m2);
	}
	
	public List <Message> getAllMessages()
	{
		
		return messageList;
		
	}
	
	private void add (Message msg)
	{
		messageList.add(msg);
	}
	

}
