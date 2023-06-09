package com.qxm.poetry.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qxm.poetry.model.entity.PoetryTextbook;
import com.qxm.poetry.model.vo.PoetryTextbookVO;

/**
 * Title: {@link PoetryTextbookService}
 * Description: 书本service接口
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/6/8 10:10
 */
public interface PoetryTextbookService extends IService<PoetryTextbook> {
    /**
     * 查找书本信息
     *
     * @param textbookId
     * @return
     */
    PoetryTextbookVO findVO(Long textbookId);
}
