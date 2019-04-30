package com.neo.rabbit.otherMethods;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Send {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	public void send() {
		String context = "hi, i am other test";
		System.out.println("Sender : " + context);
		rabbitTemplate.convertAndSend("rrr", context);
	}
}
