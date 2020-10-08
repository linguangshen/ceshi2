package com.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
@Api(value = "测试的controller")
public class test1 {

//    @RequestParam("pageNum")int pageNum
    @ApiOperation(value = "这是一个测试",notes = "")
    @PostMapping("test")
    public void test1(@RequestBody TestBean bean){
        System.out.println("页数是:"+bean.getPageNum()+" 每页条数"+bean.getSize()+"    list:"+bean.getList().toString());
//        System.out.println("页面是："+pageNum);
    }

    @ApiOperation(value = "这是测试2",notes = "这好像是测试2的备注")
    @ApiImplicitParam("")
    @PostMapping("test2")
    public String test2(@RequestBody TestBean bean){
        System.out.println("这是测试2");
        return "success";
    }


    @GetMapping("test3")
    @ApiOperation("测试3")
    @ApiImplicitParams( {@ApiImplicitParam(name = "name",value = "名字",required = false,paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "age",value = "年龄",required = true,paramType = "query",dataType = "Integer")})
    public String test3(@RequestParam(required = false)String name,@RequestParam("age") int age){
        System.out.println("名字："+name+"年龄:"+age);
        return "success";
    }
}
