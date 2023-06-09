package com.qxm.poetry.mapper;

import com.qxm.common.mybatis.SuperMapper;
import com.qxm.poetry.model.entity.PoetryTextbook;
import com.qxm.poetry.model.vo.PoetryTextbookVO;
import org.springframework.stereotype.Repository;

/**
 * Title: {@link PoetryTextbookMapper}
 * Description: 书本dao接口
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/6/8 10:12
 */
@Repository
public interface PoetryTextbookMapper extends SuperMapper<PoetryTextbook> {

    /**
     * 查询书本信息
     *
     * @param textbookId
     * @return
     */
    PoetryTextbookVO selectPoetryTextbook(Long textbookId);
}
