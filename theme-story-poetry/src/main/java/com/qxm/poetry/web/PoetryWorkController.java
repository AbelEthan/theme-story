package com.qxm.poetry.web;

import com.qxm.common.model.ApiResponse;
import com.qxm.poetry.model.entity.PoetryWork;
import com.qxm.poetry.service.PoetryWorkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: {@link PoetryWorkController}
 * Description: 古代人物counter控制器
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Slf4j
@RestController
@RequestMapping("/poetry/work")
public class PoetryWorkController {

    final PoetryWorkService poetryWorkService;

    public PoetryWorkController(PoetryWorkService poetryWorkService) {
        this.poetryWorkService = poetryWorkService;
    }


    /**
     * 获取诗词信息
     *
     * @return API response json
     */
    @GetMapping("/{id}")
    ApiResponse get(@PathVariable("id") Long id) {
        PoetryWork poetryWork = poetryWorkService.getById(id);
        return ApiResponse.ok(poetryWork);
    }
}