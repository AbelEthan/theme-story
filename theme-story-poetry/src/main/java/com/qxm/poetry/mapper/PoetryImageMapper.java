package com.qxm.poetry.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.qxm.common.model.PageParams;
import com.qxm.common.mybatis.SuperMapper;
import com.qxm.poetry.model.entity.PoetryImage;
import com.qxm.poetry.model.vo.PoetryImageVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

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
     * 分页查询图片信息列表
     *
     * @param pageParams
     * @param map
     * @return
     */
    IPage<PoetryImageVO> selectPoetryImagePage(PageParams pageParams, @Param("ew") Map map);

    /**
     * 查询图片信息
     *
     * @param authorId
     * @return
     */
    PoetryImageVO selectPoetryImage(Long authorId);
}
