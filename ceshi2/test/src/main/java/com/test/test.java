package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class test {
    @Value("${myurl.url1}")
    private String url1;

    @Value("${myurl.url2}")
    private String url2;

    @GetMapping("test1")
    public List<String> test(){
        List list =new ArrayList<String>();
        list.add(url1);
        list.add(url2);
        return list;
    }
}
