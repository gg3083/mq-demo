package cn.gg3083.mq.common.queue.impl;

import cn.gg3083.mq.common.queue.ISendMsgService;
import cn.gg3083.mq.common.util.QueueConst;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author GG
 * @date 2019/2/21 16:55
 */
@Service
public class RabbitService implements ISendMsgService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public String sendMsg(String msg) {
        amqpTemplate.convertAndSend(QueueConst.NOTICE_THEME,msg );
        return "发送消息为" + msg;
    }

    @Override
    public boolean sendMessage(String msg) {
        return false;
    }
}
