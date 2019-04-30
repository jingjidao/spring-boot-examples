package com.neo.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neo.rabbit.otherMethods.Send;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OtherTest {
	
	@Autowired
	private Send neoSender2;
	
	@Test
	public void topic1() throws Exception {
		neoSender2.send();
	}
	
	//new的话就用不了加载的rabbitTemplate了
//	@Test
//	public void topic2() throws Exception {
//		new Send().send();
//	}
}
