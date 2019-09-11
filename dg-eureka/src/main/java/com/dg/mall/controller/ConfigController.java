package com.dg.mall.controller;

import com.dg.mall.config.ConfigInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: helisen
 * @create: 2019/9/10 10:49
 * @description:
 */
@RefreshScope
@RestController
@RequestMapping(value = "/config")
public class ConfigController {

    @Autowired
    private ConfigInfoProperties configInfoProperties;

    @GetMapping(value = "/getConfigInfo")
    public String getConfigInfo(){
        return configInfoProperties.getConfig();
    }
}
