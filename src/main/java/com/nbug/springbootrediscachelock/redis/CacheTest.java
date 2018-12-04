package com.nbug.springbootrediscachelock.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CacheTest {
    @Autowired
    public RedisCache redisCache;

    @RequestMapping("/getList")
    public List get(){
        return redisCache.get();
    }

    @RequestMapping("/delete")
    public int delete(){
        return redisCache.delete();
    }


}
