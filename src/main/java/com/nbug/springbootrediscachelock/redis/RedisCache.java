package com.nbug.springbootrediscachelock.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@CacheConfig(cacheNames = "/getList")
@Slf4j
public class RedisCache {
    //该方法开启缓存
    @Cacheable(key = "'list'")
    public List get() {
        String a = "aaaaaaa";
        String b = "aaaaaaabbbbccccccccc";
        String c = "aaaaaaaccc";
        List list = new ArrayList();
        list.add(a);
        list.add(b);
        list.add(c);
        log.info("执行了get方法，没有使用缓存");
        return list;
    }

    //如果数据库数据进行了更新，在这行该方法后，删除指定key的缓存
    @CacheEvict(key = "'list'")
    public int delete() {
        log.info("删除了list缓存");
        return 1;
    }

}
