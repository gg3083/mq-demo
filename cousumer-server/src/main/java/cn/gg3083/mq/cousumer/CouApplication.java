package cn.gg3083.mq.cousumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author GG
 * @date 2019/2/21 14:59
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.gg3083.mq.cousumer.*","cn.gg3083.mq.common.*"})
public class CouApplication {

    public static void main(String[] args) {
        SpringApplication.run( CouApplication.class , args );
    }
}
