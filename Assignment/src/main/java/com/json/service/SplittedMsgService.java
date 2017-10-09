package com.json.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="splittedMsgService")
public class SplittedMsgService {
	@ServiceActivator(inputChannel="splittedMsgChannel", autoStartup="true")
	public void processMsg(Message<?> msg){
		System.out.println("Record : "+msg.getPayload());
	}
}
