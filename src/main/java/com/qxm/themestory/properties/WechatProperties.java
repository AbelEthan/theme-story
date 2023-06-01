package com.qxm.themestory.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: {@link WechatProperties}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/6/1 9:43
 * @Describes
 */
@Data
@Configuration
@ConfigurationProperties("qxm.wechat")
public class WechatProperties {
    private String appid;
    private String secret;
}
