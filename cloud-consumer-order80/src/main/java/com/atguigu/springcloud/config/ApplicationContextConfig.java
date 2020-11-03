package com.atguigu.springcloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2020-11-03 13:33
 */
@SpringBootConfiguration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced //resttemplate集成ribbon组件,做负载均衡使用
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
