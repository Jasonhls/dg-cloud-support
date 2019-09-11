package com.dg.mall.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author: helisen
 * @create: 2019/9/10 10:53
 * @description:
 */
@Component
@RefreshScope
public class ConfigInfoProperties {
    @Value("${spring.security.user.name}")
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
