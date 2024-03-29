package com.qxm.poetry.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxm.common.enums.IBaseEnum;
import com.qxm.common.enums.StatusEnum;
import com.qxm.poetry.mapper.PoetryAuthorMapper;
import com.qxm.poetry.model.entity.PoetryAuthor;
import com.qxm.poetry.model.vo.PoetryAuthorVO;
import com.qxm.poetry.service.PoetryAuthorService;
import org.springframework.stereotype.Service;

/**
 * Title: {@link PoetryAuthorServiceImpl}
 * Description: 古代人物service实现
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Service
public class PoetryAuthorServiceImpl extends ServiceImpl<PoetryAuthorMapper, PoetryAuthor> implements PoetryAuthorService {

    final PoetryAuthorMapper poetryAuthorMapper;

    public PoetryAuthorServiceImpl(PoetryAuthorMapper poetryAuthorMapper) {
        this.poetryAuthorMapper = poetryAuthorMapper;
    }

    @Override
    public PoetryAuthorVO findVO(Long authorId) {
        PoetryAuthorVO vo = poetryAuthorMapper.selectPoetryAuthor(authorId);
        if (ObjectUtil.isNotEmpty(vo)) {
            vo.setStatusValue(IBaseEnum.getEnumValue(vo.getStatus(), StatusEnum.class));
        }
        return vo;
    }

}
