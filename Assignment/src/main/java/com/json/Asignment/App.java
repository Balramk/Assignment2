package com.json.Asignment;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("beans.xml");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--------------------------------");
	}
}
