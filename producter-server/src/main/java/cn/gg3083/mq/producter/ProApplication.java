package cn.gg3083.mq.producter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author GG
 * @date 2019/2/21 15:04
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.gg3083.mq.producter.*","cn.gg3083.mq.common.*"})
public class ProApplication {

    public static void main(String[] args) {
        SpringApplication.run( ProApplication.class , args );
    }
}
