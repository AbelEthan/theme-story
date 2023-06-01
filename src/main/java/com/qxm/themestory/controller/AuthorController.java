package com.qxm.themestory.controller;

import com.qxm.themestory.config.ApiResponse;
import com.qxm.themestory.model.Author;
import com.qxm.themestory.service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: {@link Author}
 * Description: 古代人物counter控制器
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Slf4j
@RestController
@RequestMapping("/author")
public class AuthorController {

    final AuthorService authorService;

    public AuthorController(@Autowired AuthorService authorService) {
        this.authorService = authorService;
    }


    /**
     * 获取人物信息
     *
     * @return API response json
     */
    @GetMapping("/{id}")
    ApiResponse get(@PathVariable("id")Long id) {
        Author author = authorService.getById(id);
        return ApiResponse.ok(author);
    }

}