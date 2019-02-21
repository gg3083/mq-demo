package cn.gg3083.mq.common.config;

import cn.gg3083.mq.common.util.QueueConst;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConf {

    @Bean
    public Queue queue() {
        return new Queue(QueueConst.NOTICE_THEME);
    }
}