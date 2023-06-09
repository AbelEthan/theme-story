package com.qxm.poetry.mapper;

import com.qxm.common.mybatis.SuperMapper;
import com.qxm.poetry.model.entity.PoetryImage;
import com.qxm.poetry.model.vo.PoetryImageVO;
import org.springframework.stereotype.Repository;

/**
 * Title: {@link PoetryImageMapper}
 * Description: 图片dao接口
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Repository
public interface PoetryImageMapper extends SuperMapper<PoetryImage> {

    /**
     * 查询图片信息
     *
     * @param authorId
     * @return
     */
    PoetryImageVO selectPoetryImage(Long authorId);
}
