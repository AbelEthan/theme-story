package com.qxm.poetry.web;

import cn.hutool.core.collection.CollectionUtil;
import com.ejlchina.searcher.BeanSearcher;
import com.ejlchina.searcher.SearchResult;
import com.qxm.common.enums.IBaseEnum;
import com.qxm.common.enums.StatusEnum;
import com.qxm.common.model.ApiResponse;
import com.qxm.poetry.model.vo.PoetryAuthorVO;
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
    final BeanSearcher beanSearcher;

    public PoetryAuthorController(BeanSearcher beanSearcher, PoetryAuthorService poetryAuthorService) {
        this.beanSearcher = beanSearcher;
        this.poetryAuthorService = poetryAuthorService;
    }

    /**
     * 获取人物信息列表
     *
     * @return API response json
     */
    @GetMapping()
    ApiResponse getPage(@RequestParam(required = false) Map map) {
        SearchResult<PoetryAuthorVO> search = beanSearcher.search(PoetryAuthorVO.class, map);
        if (CollectionUtil.isNotEmpty(search.getDataList())) {
            search.getDataList().stream().forEach(vo -> {
                vo.setStatusValue(IBaseEnum.getEnumValue(vo.getStatus(), StatusEnum.class));
            });
        }
        return ApiResponse.ok(search);
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