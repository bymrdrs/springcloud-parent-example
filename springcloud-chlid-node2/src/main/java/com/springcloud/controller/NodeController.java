package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // 热更新作用
@RestController
@RequestMapping("/node")
public class NodeController {

    @Value("${node.name}")
    private String name;
    @Value("${node.value}")
    private String value;
    @Value("${node.controller.name}")
    private String controllerName;

    @GetMapping("/getControllerInfo")
    public String getControllerInfo() {
        return "获取的值：" + name + ":" + value + ":" + controllerName;
    }

}
