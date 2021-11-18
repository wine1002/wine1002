package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiat
 */
@RestController
public class TestController {
    /**
     *
     * GET/POST/PUT/DELETE
     *
     */
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
