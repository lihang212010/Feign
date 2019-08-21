package com.example.demo;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
@EnableFeignClients
@SpringBootApplication

public class DemoCloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCloudConsumerApplication.class, args);
	}

}
