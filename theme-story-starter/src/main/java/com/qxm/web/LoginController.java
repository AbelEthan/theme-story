package com.qxm.web;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.qxm.common.model.ApiResponse;
import com.qxm.common.properties.WechatProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: {@link LoginController}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/6/1 9:41
 * @Describes
 */
@Slf4j
@RestController
public class LoginController {

    final private WechatProperties properties;

    public LoginController(WechatProperties properties) {
        this.properties = properties;
    }

    /**
     * 通过code登录获取微信openid和sessionKey
     *
     * @param code
     * @return
     */
    @PostMapping("/login")
    ApiResponse login(@RequestParam("code") String code){
        Map<String, String> requestUrlParam = new HashMap<>(4);
        requestUrlParam.put("appid", properties.getAppid());
        requestUrlParam.put("secret", properties.getSecret());
        requestUrlParam.put("js_code", code);
        requestUrlParam.put("grant_type", "authorization_code");
        HttpResponse response = HttpRequest.get("https://api.weixin.qq.com/sns/jscode2session").formStr(requestUrlParam).execute();
        log.info(response.toString());
        return ApiResponse.ok(response.body());
    }

}
