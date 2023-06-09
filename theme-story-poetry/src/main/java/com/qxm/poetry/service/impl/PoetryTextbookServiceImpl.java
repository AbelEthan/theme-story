package com.qxm.poetry.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxm.common.enums.IBaseEnum;
import com.qxm.common.enums.StatusEnum;
import com.qxm.common.enums.TextbookTypeEnum;
import com.qxm.poetry.mapper.PoetryTextbookMapper;
import com.qxm.poetry.model.entity.PoetryTextbook;
import com.qxm.poetry.model.vo.PoetryTextbookVO;
import com.qxm.poetry.service.PoetryTextbookService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: {@link PoetryTextbookServiceImpl}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/6/8 16:59
 * @Describes
 */
@Service
public class PoetryTextbookServiceImpl extends ServiceImpl<PoetryTextbookMapper, PoetryTextbook> implements PoetryTextbookService {

    final private PoetryTextbookMapper poetryTextbookMapper;

    public PoetryTextbookServiceImpl(PoetryTextbookMapper poetryTextbookMapper) {
        this.poetryTextbookMapper = poetryTextbookMapper;
    }

    @Override
    public PoetryTextbookVO findVO(Long textbookId) {
        PoetryTextbookVO vo = poetryTextbookMapper.selectPoetryTextbook(textbookId);
        if (ObjectUtil.isNotEmpty(vo)) {
            vo.setStatusValue(IBaseEnum.getEnumValue(vo.getStatus(), StatusEnum.class));
            vo.setTypeValue(IBaseEnum.getEnumValue(vo.getType(), TextbookTypeEnum.class));
        }
        return vo;
    }
}
