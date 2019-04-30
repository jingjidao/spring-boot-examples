package com.neo.rabbit.otherMethods;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings=@QueueBinding(value=@Queue(value="xxxx"),key="rrr", exchange=@Exchange(value="fff")))
public class Receive {
	
	@RabbitHandler
	public void proccess(String message) {
		System.out.println(message);
	}
}
