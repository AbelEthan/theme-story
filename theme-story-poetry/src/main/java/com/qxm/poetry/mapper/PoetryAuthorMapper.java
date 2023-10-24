package com.qxm.poetry.mapper;

import com.qxm.common.mybatis.SuperMapper;
import com.qxm.poetry.model.entity.PoetryAuthor;
import com.qxm.poetry.model.vo.PoetryAuthorVO;
import org.springframework.stereotype.Repository;

/**
 * Title: {@link PoetryAuthor}
 * Description: 古代人物dao接口
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Repository
public interface PoetryAuthorMapper extends SuperMapper<PoetryAuthor> {

    /**
     * 查询作者信息
     *
     * @param authorId
     * @return
     */
    PoetryAuthorVO selectPoetryAuthor(Long authorId);
}
