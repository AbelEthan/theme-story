package com.qxm.poetry.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qxm.poetry.model.entity.PoetryImage;
import com.qxm.poetry.model.vo.PoetryImageVO;

/**
 * Title: {@link PoetryImageService}
 * Description: 图片service接口
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:10
 */
public interface PoetryImageService extends IService<PoetryImage> {
    /**
     * 查找图片信息
     *
     * @param authorId
     * @return
     */
    PoetryImageVO findVO(Long authorId);
}
