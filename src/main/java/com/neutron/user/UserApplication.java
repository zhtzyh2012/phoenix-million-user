package com.neutron.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;

/**
 * 用户模块入口类
 *
 * @author neutron
 */
@SpringBootApplication(exclude = {
        RedisAutoConfiguration.class,
        RedisRepositoriesAutoConfiguration.class
})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}

/*
 * 知识介绍:
 * 1.其中@SpringBootApplication注解是spring boot的核心注解
 * 2.因为spring boot是jar包运行,所以必须有main方法
 * 3.问题:spring boot项目中虽然配置redis依赖,但是不想让spring boot自动检测redis配置,如何处理呢?
 *   答案1: @SpringBootApplication(exclude = {RedisAutoConfiguration.class, RedisRepositoriesAutoConfiguration.class})
 *   答案2: 删除redis依赖配置
 * 4.当增加mybatis依赖后,那么就需要配置数据库的配置文件,所以如果此时不需要数据库配置,注释掉mybatis依赖.
 */
