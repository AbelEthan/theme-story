package com.qxm.poetry.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxm.poetry.mapper.PoetryMapper;
import com.qxm.poetry.model.entity.Poetry;
import com.qxm.poetry.model.entity.PoetryAuthor;
import com.qxm.poetry.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title: {@link PoetryAuthor}
 * Description: 古诗词service实现
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Service
public class PoetryServiceImpl extends ServiceImpl<PoetryMapper, Poetry> implements PoetryService {

    final PoetryMapper poetryMapper;

    public PoetryServiceImpl(@Autowired PoetryMapper poetryMapper) {
        this.poetryMapper = poetryMapper;
    }

    @Override
    public List<Poetry> findListByDynasty(String dynasty) {
        QueryWrapper<Poetry> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Poetry::getDynasty, dynasty);
        return poetryMapper.selectList(queryWrapper);
    }

    @Override
    public List<Poetry> findListByAuthor(String author) {
        QueryWrapper<Poetry> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Poetry::getAuthor, author);
        return poetryMapper.selectList(queryWrapper);
    }

    @Override
    public List<Poetry> findListByTag(String tag) {
        QueryWrapper<Poetry> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Poetry::getTag, tag);
        return poetryMapper.selectList(queryWrapper);
    }
}
