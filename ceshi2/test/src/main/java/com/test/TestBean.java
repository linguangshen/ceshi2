package com.test;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class TestBean {
    private int pageNum;
    private int size;
    List<String> list;
}
