package poc.spring.integration;

import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class SenderReceiver {
	
	public MessageChannel getInputChannel() {
		return inputChannel;
	}
	public void setInputChannel(MessageChannel inputChannel) {
		this.inputChannel = inputChannel;
	}
	private MessageChannel inputChannel;
	public QueueChannel getOutChannel() {
		return outChannel;
	}
	public void setOutChannel(QueueChannel outChannel) {
		this.outChannel = outChannel;
	}
	private QueueChannel outChannel;
	
	public void sendAndReceive(String payload)
	{

		Message<String> message = MessageBuilder.withPayload(payload).build();
		inputChannel.send(message);		
		Message<String> receivedmessage =(Message<String>) outChannel.receive();
		System.out.println(receivedmessage.getPayload());
	
	}


}
