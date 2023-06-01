package com.qxm.themestory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: {@link AutoConfiguration}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/5/31 11:42
 * @Describes
 */
@Configuration
public class AutoConfiguration {

    @Bean
    public CustomSqlInjector sqlInjector(){
        return new CustomSqlInjector();
    }
}
