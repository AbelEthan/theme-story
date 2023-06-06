package com.qxm.poetry.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxm.common.enums.IBaseEnum;
import com.qxm.common.enums.StatusEnum;
import com.qxm.common.model.PageParams;
import com.qxm.poetry.mapper.PoetryImageMapper;
import com.qxm.poetry.model.entity.PoetryAuthor;
import com.qxm.poetry.model.entity.PoetryImage;
import com.qxm.poetry.model.vo.PoetryImageVO;
import com.qxm.poetry.service.PoetryImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Title: {@link PoetryAuthor}
 * Description: 图片service实现
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Service
public class PoetryImageServiceImpl extends ServiceImpl<PoetryImageMapper, PoetryImage> implements PoetryImageService {

    final PoetryImageMapper poetryImageMapper;

    public PoetryImageServiceImpl(@Autowired PoetryImageMapper poetryImageMapper) {
        this.poetryImageMapper = poetryImageMapper;
    }

    @Override
    public IPage<PoetryImageVO> findPage(Map map) {
        IPage<PoetryImageVO> iPage = poetryImageMapper.selectPoetryImagePage(new PageParams(map), map);
        if (CollectionUtil.isNotEmpty(iPage.getRecords())) {
            iPage.getRecords().stream().forEach(vo -> {
                vo.setStatusValue(IBaseEnum.getEnumValue(vo.getStatus(), StatusEnum.class));
            });
        }
        return iPage;
    }

    @Override
    public PoetryImageVO findVO(Long authorId) {
        PoetryImageVO vo = poetryImageMapper.selectPoetryImage(authorId);
        if (ObjectUtil.isNotEmpty(vo)) {
            vo.setStatusValue(IBaseEnum.getEnumValue(vo.getStatus(), StatusEnum.class));
        }
        return vo;
    }

}
