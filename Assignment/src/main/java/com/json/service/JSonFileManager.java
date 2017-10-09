package com.json.service;

import java.io.File;

import org.springframework.messaging.Message;

public class JSonFileManager {
	public Message<File> process(Message<File> inputMsg) {
		System.out.println(inputMsg.getPayload().getName()+" recieved successfully!");
		return inputMsg;
	}
}
