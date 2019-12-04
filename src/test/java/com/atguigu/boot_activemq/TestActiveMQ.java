package com.atguigu.boot_activemq;

import com.atguigu.boot_activemq.produce.Queue_Produce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes=MainApp_Produce.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestActiveMQ {

    @Resource
    private Queue_Produce queue_produce;

    @Test
    public void testSend()
    {
        queue_produce.produceMsgScheduled();
    }
}
