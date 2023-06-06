package com.qxm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: {@link ThemeStoryApplication}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/6/1 9:41
 * @Describes 主题故事启动类
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.qxm.*"})
public class ThemeStoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThemeStoryApplication.class, args);
    }
}
