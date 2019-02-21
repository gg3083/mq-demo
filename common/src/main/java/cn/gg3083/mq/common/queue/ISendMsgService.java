package cn.gg3083.mq.common.queue;

/**
 * @author GG
 * @date 2019/2/21 14:52
 */
public interface ISendMsgService {

     String sendMsg(String msg);

     boolean sendMessage(String msg);
}
