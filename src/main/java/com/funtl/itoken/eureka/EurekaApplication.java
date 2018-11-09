package com.funtl.itoken.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Title: EurekaApplication</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/9 15:30
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
