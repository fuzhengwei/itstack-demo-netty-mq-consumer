package itstack.demo.netty.mq.consumer.service.topic.test;

import itstack.demo.netty.mq.consumer.service.topic.TopicReceiver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by fuzhengwei on 2016/6/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class StartTest {

    @Resource
    private TopicReceiver topicReceiver;

    @Test
    public void test_startConsumer() throws Exception{
        //hold住，开始消费消息
        System.in.read();

    }

}
