package com.atguigu.boot_activemq.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;

@Component
public class Queue_Produce {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;//

    public void produceMsg()
    {
        jmsMessagingTemplate.convertAndSend(queue,"*******"+ UUID.randomUUID().toString().substring(0,6));
        System.out.println("*******触发投递");
    }

    @Scheduled(fixedDelay = 3000)
    public void produceMsgScheduled()
    {
        jmsMessagingTemplate.convertAndSend(queue,"********"+UUID.randomUUID().toString().substring(0,10));
        System.out.println("定时 send  OK");
    }
}
