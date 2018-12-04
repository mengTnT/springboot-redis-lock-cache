package com.nbug.springbootrediscachelock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootRedisCacheLockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisCacheLockApplication.class, args);
    }
}
