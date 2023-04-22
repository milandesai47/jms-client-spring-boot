package com.jms.jmstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class Sender implements Runnable{

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Sender.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    Thread t1= new Thread("Thread 1");
    Thread t2= new Thread("Thread 1");
    public void send(String message) {

        LOGGER.info("sending message='{}'", message);
        jmsTemplate.setPriority(1);
        jmsTemplate.convertAndSend("helloworld.q1", message);
        //jmsTemplate.convertAndSend("helloworld.q2",message);
    }

    @Override
    public void run() {

    }
}
