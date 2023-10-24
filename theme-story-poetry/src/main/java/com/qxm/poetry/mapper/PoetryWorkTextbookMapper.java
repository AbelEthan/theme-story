package com.qxm.poetry.mapper;

import com.qxm.common.mybatis.SuperMapper;
import com.qxm.poetry.model.entity.PoetryWorkTextbook;
import org.springframework.stereotype.Repository;

/**
 * Title: {@link PoetryWorkTextbookMapper}
 * Description: 作品与书本关联dao接口
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Repository
public interface PoetryWorkTextbookMapper extends SuperMapper<PoetryWorkTextbook> {
}
