package com.qxm.poetry.web;

import com.qxm.common.enums.IBaseEnum;
import com.qxm.common.enums.StatusEnum;
import com.qxm.common.model.ApiResponse;
import com.qxm.poetry.model.entity.Poetry;
import com.qxm.poetry.service.PoetryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Title: {@link PoetryController}
 * Description: 古代人物counter控制器
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Slf4j
@RestController
@RequestMapping("/poetry")
public class PoetryController {

    final PoetryService poetryService;

    public PoetryController(PoetryService poetryService) {
        this.poetryService = poetryService;
    }


    /**
     * 获取诗词信息
     *
     * @return API response json
     */
    @GetMapping("/{id}")
    ApiResponse get(@PathVariable("id") Long id) {
        Poetry poetry = poetryService.getById(id);
        return ApiResponse.ok(poetry);
    }

    /**
     * 获取诗词列表通过朝代
     *
     * @param dynasty
     * @return
     */
    @GetMapping("/list/dynasty")
    ApiResponse getListByDynasty(@RequestParam("dynasty") String dynasty) {
        List<Poetry> list = poetryService.findListByDynasty(dynasty);
        return ApiResponse.ok(list);
    }

    /**
     * 获取诗词列表通过姓名
     *
     * @param author
     * @return
     */
    @GetMapping("/list/author")
    ApiResponse getListByAuthor(@RequestParam("author") String author) {
        List<Poetry> list = poetryService.findListByAuthor(author);
        return ApiResponse.ok(list);
    }

    /**
     * 获取诗词列表通过标签
     *
     * @param tag
     * @return
     */
    @GetMapping("/list/tag")
    ApiResponse getListByTag(@RequestParam("tag") String tag) {
        List<Poetry> list = poetryService.findListByTag(tag);
        return ApiResponse.ok(list);
    }


    /**
     * 获取朝代列表
     *
     * @return
     */
    @GetMapping("/status/list")
    ApiResponse getDynastyList() {
        List<Map<String, Object>> mapList = IBaseEnum.getMapList(StatusEnum.class);
        return ApiResponse.ok(mapList);
    }
}