package com.qxm.poetry.web;

import com.qxm.common.model.ApiResponse;
import com.qxm.poetry.service.PoetryAuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Title: {@link PoetryAuthorController}
 * Description: 古代人物counter控制器
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Slf4j
@RestController
@RequestMapping("/poetry/author")
public class PoetryAuthorController {

    final PoetryAuthorService poetryAuthorService;

    public PoetryAuthorController(PoetryAuthorService poetryAuthorService) {
        this.poetryAuthorService = poetryAuthorService;
    }

    /**
     * 分页获取人物信息
     *
     * @return API response json
     */
    @GetMapping("/page")
    ApiResponse getPage(@RequestParam(required = false) Map map) {
        return ApiResponse.ok(poetryAuthorService.findPage(map));
    }


    /**
     * 获取人物信息
     *
     * @return API response json
     */
    @GetMapping("/{id}")
    ApiResponse get(@PathVariable("id") Long id) {
        return ApiResponse.ok(poetryAuthorService.findVO(id));
    }

}