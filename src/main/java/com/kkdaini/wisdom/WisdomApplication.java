package com.kkdaini.wisdom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.kkdaini.wisdom.mapper")
public class WisdomApplication {

    public static void main(String[] args) {
        SpringApplication.run(WisdomApplication.class, args);
    }

}
