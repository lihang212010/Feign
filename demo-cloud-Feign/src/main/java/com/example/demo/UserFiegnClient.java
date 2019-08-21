package com.example.demo;

import java.security.PublicKey;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "demo-cloud-user",fallback = FeignClientFallback.class)
public interface UserFiegnClient {
@GetMapping(value = "/{id}")
public Users findById(@PathVariable("id") Long id);
}
