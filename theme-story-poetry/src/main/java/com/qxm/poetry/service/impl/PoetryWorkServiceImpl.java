package com.qxm.poetry.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxm.poetry.mapper.PoetryWorkMapper;
import com.qxm.poetry.model.entity.PoetryWork;
import com.qxm.poetry.model.entity.PoetryAuthor;
import com.qxm.poetry.service.PoetryWorkService;
import org.springframework.stereotype.Service;

/**
 * Title: {@link PoetryAuthor}
 * Description: 古诗词service实现
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Service
public class PoetryWorkServiceImpl extends ServiceImpl<PoetryWorkMapper, PoetryWork> implements PoetryWorkService {

    final PoetryWorkMapper poetryWorkMapper;

    public PoetryWorkServiceImpl(PoetryWorkMapper poetryWorkMapper) {
        this.poetryWorkMapper = poetryWorkMapper;
    }
}
