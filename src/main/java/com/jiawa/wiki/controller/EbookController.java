package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jiat
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Autowired
    private EbookService ebookService;
    /**
     *
     * GET/POST/PUT/DELETE
     *
     */
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!Ebook";
    }
    @GetMapping("/list")
    public List<Ebook> list(){
        return ebookService.list();
    }
}
