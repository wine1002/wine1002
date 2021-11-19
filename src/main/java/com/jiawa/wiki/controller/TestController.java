package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jiat
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    /**
     *
     * GET/POST/PUT/DELETE
     *
     */
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!Test";
    }
    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
