package com.springcloud.controller;

import com.springcloud.service.NodeService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class DubboController {

    @DubboReference
    private NodeService nodeService;

    @GetMapping("getServiceInfo")
    public String getServiceInfo() {
        return nodeService.getServiceInfo();
    }

}
