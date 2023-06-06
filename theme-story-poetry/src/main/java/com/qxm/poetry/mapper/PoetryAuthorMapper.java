package com.qxm.poetry.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.qxm.common.model.PageParams;
import com.qxm.common.mybatis.SuperMapper;
import com.qxm.poetry.model.entity.PoetryAuthor;
import com.qxm.poetry.model.vo.PoetryAuthorVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

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
     * 分页查询作者信息列表
     *
     * @param pageParams
     * @param map
     * @return
     */
    IPage<PoetryAuthorVO> selectPoetryAuthorPage(PageParams pageParams, @Param("ew") Map map);

    /**
     * 查询作者信息
     *
     * @param authorId
     * @return
     */
    PoetryAuthorVO selectPoetryAuthor(Long authorId);
}
