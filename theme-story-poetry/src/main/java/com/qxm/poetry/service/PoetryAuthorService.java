package com.qxm.poetry.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qxm.poetry.model.entity.PoetryAuthor;
import com.qxm.poetry.model.vo.PoetryAuthorVO;

/**
 * Title: {@link PoetryAuthorService}
 * Description: 古代人物service接口
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:10
 */
public interface PoetryAuthorService extends IService<PoetryAuthor> {

    /**
     * 查找作者信息
     *
     * @param authorId
     * @return
     */
    PoetryAuthorVO findVO(Long authorId);
}
