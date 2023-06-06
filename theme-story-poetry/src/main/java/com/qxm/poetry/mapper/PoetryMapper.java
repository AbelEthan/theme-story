package com.qxm.poetry.mapper;

import com.qxm.common.mybatis.SuperMapper;
import com.qxm.poetry.model.entity.Poetry;
import org.springframework.stereotype.Repository;

/**
 * Title: {@link PoetryMapper}
 * Description: 古诗词dao接口
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Repository
public interface PoetryMapper extends SuperMapper<Poetry> {
}
