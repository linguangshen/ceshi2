package com.test.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.Brand;
import com.test.Dao.BrandMapper;
import com.test.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> query() {
        List<Brand> brandList = brandMapper.selectAll();
        return brandList;
    }
}
