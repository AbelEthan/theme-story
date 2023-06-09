package com.qxm.poetry.web;

import cn.hutool.core.collection.CollectionUtil;
import com.ejlchina.searcher.BeanSearcher;
import com.ejlchina.searcher.SearchResult;
import com.qxm.common.enums.IBaseEnum;
import com.qxm.common.enums.StatusEnum;
import com.qxm.common.enums.TextbookTypeEnum;
import com.qxm.common.model.ApiResponse;
import com.qxm.poetry.model.vo.PoetryTextbookVO;
import com.qxm.poetry.service.PoetryTextbookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Title: {@link PoetryTextbookController}
 * Description: 书本counter控制器
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Slf4j
@RestController
@RequestMapping("/poetry/textbook")
public class PoetryTextbookController {

    final BeanSearcher beanSearcher;
    final PoetryTextbookService poetryTextbookService;

    public PoetryTextbookController(BeanSearcher beanSearcher, PoetryTextbookService poetryTextbookService) {
        this.beanSearcher = beanSearcher;
        this.poetryTextbookService = poetryTextbookService;
    }

    /**
     * 获取图片信息列表
     *
     * @return API response json
     */
    @GetMapping
    ApiResponse get(@RequestParam(required = false) Map map) {
        SearchResult<PoetryTextbookVO> search = beanSearcher.search(PoetryTextbookVO.class, map);
        if (CollectionUtil.isNotEmpty(search.getDataList())) {
            search.getDataList().stream().forEach(vo -> {
                vo.setTypeValue(IBaseEnum.getEnumValue(vo.getType(), TextbookTypeEnum.class));
                vo.setStatusValue(IBaseEnum.getEnumValue(vo.getStatus(), StatusEnum.class));
            });
        }
        return ApiResponse.ok(search);
    }

    /**
     * 获取图片信息列表
     *
     * @return API response json
     */
    @GetMapping("/{id}")
    ApiResponse get(@PathVariable("id") Long id) {
        return ApiResponse.ok(poetryTextbookService.findVO(id));
    }

}