package com.qxm.themestory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qxm.themestory.model.Poetry;

import java.util.List;

/**
 * Title: {@link PoetryService}
 * Description: 古诗词service接口
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:10
 */
public interface PoetryService extends IService<Poetry> {
    /**
     * 通过朝代获取古诗词
     *
     * @param dynasty
     * @return
     */
    List<Poetry> findListByDynasty(String dynasty);

    /**
     * 通过作者获取古诗词
     *
     * @param author
     * @return
     */
    List<Poetry> findListByAuthor(String author);

    /**
     * 通过标签获取古诗词
     *
     * @param tag
     * @return
     */
    List<Poetry> findListByTag(String tag);
}
