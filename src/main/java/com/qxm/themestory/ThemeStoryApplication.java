package com.qxm.themestory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.qxm.themestory.dao"})
public class ThemeStoryApplication {

  public static void main(String[] args) {
    SpringApplication.run(ThemeStoryApplication.class, args);
  }
}
