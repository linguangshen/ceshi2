package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.xml.soap.Node;

@SpringBootTest(classes = RedisApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTemplateTest {
    @Autowired
    private RedisTemplate redisTemplate;
    //因为spring自动注入管理了bean容器，直接用@Autowired取即可
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void test(){

        //设置值
        stringRedisTemplate.opsForValue().set("String", "Mao");
    }

   /* @Test
    public void test2(){
        Jedis jedis = new Jedis("localhost",6379);
        *//*jedis.set("key1","nihao1");*//*
        System.out.println(jedis.get("key1"));

    }*/
    private Comparable comparable;
}
