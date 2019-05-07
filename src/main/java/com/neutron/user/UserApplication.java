package com.neutron.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 用户模块入口类
 *
 * @author neutron
 */
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}

/*
 * 知识介绍:
 * 其中@SpringBootApplication注解是spring boot的核心注解
 * 因为spring boot是jar包运行,所以必须有main方法
 */
