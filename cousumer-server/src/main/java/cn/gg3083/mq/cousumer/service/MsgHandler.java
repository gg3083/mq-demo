package cn.gg3083.mq.cousumer.service;

import cn.gg3083.mq.common.util.QueueConst;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author GG
 * @date 2019/2/21 15:01
 */
@Component
public class MsgHandler {

    @KafkaListener(topics = {QueueConst.CHAT_THEME})
    public void receive(String message) {
        System.err.println("消费消息为" + message);
    }


    @RabbitListener(queues = QueueConst.NOTICE_THEME)    //监听器监听指定的Queue
    public void processC(String message) {
        System.err.println("消费消息为:" + message);
    }


}
