package poc.spring.integration;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class SpringIntegrationHelloWorldExample {
	
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		try {
			SenderReceiver senderReceiver = (SenderReceiver) context.getBean("senderReceiver");
			senderReceiver.sendAndReceive("120");
		
		}
		finally
		{
			context.close();
		}
		
		
	}
	
}
