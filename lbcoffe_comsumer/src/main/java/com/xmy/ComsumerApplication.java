package com.xmy;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration//识别dubbo的相关注解  666dd
public class ComsumerApplication {

    public static void main(String[] args) {

//这是第一次拉去1231aa  777
        SpringApplication.run(ComsumerApplication.class, args);
        System.out.println("消费端启动成功！！！");

    }
}
