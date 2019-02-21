package cn.gg3083.mq.common.queue.impl;

import cn.gg3083.mq.common.util.QueueConst;
import cn.gg3083.mq.common.queue.ISendMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author GG
 * @date 2019/2/21 14:54
 */
@Service
public class KafkaService implements ISendMsgService {

    @Autowired
    KafkaTemplate kafkaTemplate;

    @Override
    public String sendMsg(String msg) {
        kafkaTemplate.send(QueueConst.CHAT_THEME, msg);
        return "发送消息为" + msg;
    }

    @Override
    public boolean sendMessage(String msg) {
        ListenableFuture future = kafkaTemplate.send(QueueConst.CHAT_THEME, msg);
        future.addCallback(
                o -> System.err.println("发送成功"),
                throwable -> System.err.println("发送失败")
        );
        return true;
    }


}
