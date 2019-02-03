package poc.spring.integration.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
 
public class SpringIntegrationJmsMsgDrivenAdapterExample {
    private JmsTemplate jmsTemplate;
     
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringIntegrationJmsMsgDrivenAdapterExample springIntExample = (SpringIntegrationJmsMsgDrivenAdapterExample) context.getBean("springIntExample");
       // springIntExample.sendEmployee();
    }
     
    public void sendEmployee() {
        Employee emp = new Employee(1, "Joe", 37);
        System.out.println("Queue employee " + emp + " for processing");
        getJmsTemplate().convertAndSend("empQueue", emp);
        getJmsTemplate().convertAndSend("empQueue", new Employee(2, "Sam", 25));
    }
     
    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }
 
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
 
   /* public void processEmployee(Employee emp) {
        System.out.println("Employee: " + emp + " processed");
    }*/
    
    
    public void processEmployeev1(String emp) {
        System.out.println("Employee: " + emp + " processed");
    }
    
}