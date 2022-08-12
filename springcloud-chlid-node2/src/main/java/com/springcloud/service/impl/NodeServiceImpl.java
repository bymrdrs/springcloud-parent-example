package com.springcloud.service.impl;

import com.springcloud.service.NodeService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService
public class NodeServiceImpl implements NodeService {

    @Value("${node.name}")
    private String name;
    @Value("${node.value}")
    private String value;
    @Value("${node.service.name}")
    private String serviceName;

    @Override
    public String getServiceInfo() {
        return "获取的值：" + name + ":" + value + ":" + serviceName;
    }

}
