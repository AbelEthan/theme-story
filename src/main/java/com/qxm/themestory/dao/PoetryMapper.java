package com.qxm.themestory.dao;

import com.qxm.themestory.config.SuperMapper;
import com.qxm.themestory.model.Author;
import com.qxm.themestory.model.Poetry;
import org.apache.ibatis.annotations.Mapper;

/**
 * Title: {@link Author}
 * Description: 古诗词dao接口
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Mapper
public interface PoetryMapper extends SuperMapper<Poetry> {
}
