package com.dg.mall.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: helisen
 * @create: 2019/9/10 16:08
 * @description:
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    @GetMapping(value = "/a")
    public String getA(){
        return "ok";
    }
}
