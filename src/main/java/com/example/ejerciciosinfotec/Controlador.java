package com.example.ejerciciosinfotec;

import org.apache.logging.log4j.spi.ObjectThreadContextMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class Controlador {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/header")
    @ResponseBody
    public Object getHeader(){
        Object forObject = restTemplate.getForObject("http://localhost:63300/test", Object.class);
        return forObject;
    }

    @GetMapping("/test")
    @ResponseBody
    public Object test(){
        return "{\"id\":9}";
    }
}
