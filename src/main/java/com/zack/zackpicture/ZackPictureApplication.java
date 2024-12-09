package com.zack.zackpicture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zack.zackpicture.mapper")
public class ZackPictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZackPictureApplication.class, args);
    }

}
