package cn.gg3083.mq.producter.controller;

import cn.gg3083.mq.common.queue.ISendMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GG
 * @date 2019/2/21 15:05
 */
@RestController
public class SendController {

    @Autowired
    @Qualifier("kafkaService")
    ISendMsgService kafkaService;

    @Autowired
    @Qualifier("rabbitService")
    ISendMsgService rabbitService;

    @GetMapping("send")
    public String sendMsg( String msg){
        return kafkaService.sendMsg( msg );
    }


    @GetMapping("send2")
    public String send2Msg( String msg){
        return rabbitService.sendMsg( msg );
    }

}
