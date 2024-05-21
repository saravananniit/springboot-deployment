package com.stackroute.webapideployment.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Saravanan.1.P
 * @Date 16-05-2024
 */
@RestController
public class SpringController {

    @GetMapping
    public Object hello(){
        Map<String, String> data =new HashMap<>();
        data.put("name","saravanan");
        data.put("email","saravanan.1.p@niit.com");
        System.out.println("welcome");
        return data;
    }
}
