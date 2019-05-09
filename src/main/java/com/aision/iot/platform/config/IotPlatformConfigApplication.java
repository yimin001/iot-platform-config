package com.aision.iot.platform.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yim
 * @description 启动类
 * @date 2019/4/26
 */
@SpringBootApplication
@EnableConfigServer
public class IotPlatformConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotPlatformConfigApplication.class, args);
    }

}
