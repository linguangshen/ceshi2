package com.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "EurekaCline")
public interface BrandFeig {

    @RequestMapping("/brand")
    public List<Brand> queryBrand();
}
