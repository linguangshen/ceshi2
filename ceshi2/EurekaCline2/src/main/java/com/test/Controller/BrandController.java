package com.test.Controller;

import com.test.Brand;
import com.test.BrandFeig;
import com.test.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandFeig brandFeig;

    @RequestMapping("brand")
    public List<Brand> queryBrand(){
        List<Brand> brandList = brandFeig.queryBrand();
        return brandList;
    }
}
