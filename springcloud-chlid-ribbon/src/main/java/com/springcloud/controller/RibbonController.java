package com.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/getControllerInfo")
    public String getControllerInfo() {
        // http://消费者将要去访问的微服务名称/接口路径1/接口路径2
        return this.restTemplate.getForObject("http://springcloud-child-node/node/getControllerInfo", String.class);
    }

}
