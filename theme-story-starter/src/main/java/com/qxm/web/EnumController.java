package com.qxm.web;

import com.qxm.common.enums.IBaseEnum;
import com.qxm.common.enums.StatusEnum;
import com.qxm.common.enums.TextbookTypeEnum;
import com.qxm.common.model.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: {@link EnumController}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/6/8 17:09
 * @Describes
 */
@RestController
@RequestMapping("/enum")
public class EnumController {
    /**
     * 获取状态枚举
     *
     * @return
     */
    @GetMapping("/status")
    ApiResponse status() {
        return ApiResponse.ok(IBaseEnum.getMapList(StatusEnum.class));
    }

    /**
     * 获取书本类型枚举
     *
     * @return
     */
    @GetMapping("/textbook/type")
    ApiResponse textbookType() {
        return ApiResponse.ok(IBaseEnum.getMapList(TextbookTypeEnum.class));
    }


}
