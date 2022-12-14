package com.master.cloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Eureka 服务注册中心.
 *
 * C:/Windows\System32\drivers\etc\hosts 加入域名转换
 *
 * @author Jerry Wan
 * @description .
 * @date 2022/10/3 10:37
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
