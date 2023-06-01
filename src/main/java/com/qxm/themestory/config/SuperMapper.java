package com.qxm.themestory.config;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: {@link SuperMapper}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/5/31 11:30
 * @Describes 自定义dao父类
 */
public interface SuperMapper <T> extends BaseMapper<T> {

    /**
     * 默认批次提交数量
     */
    int DEFAULT_BATCH_SIZE = 1000;

    /**
     * 批量添加
     *
     * @param entityList
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    default int insertBatchColumn(List<T> entityList) {
        return this.insertBatchSomeColumn(entityList, DEFAULT_BATCH_SIZE);
    }

    /**
     * 批量新增数据
     *
     * @param entityList
     * @return
     */
    int insertBatchSomeColumn(List<T> entityList);

    /**
     * 分批插入，每次插入
     *
     * @param entityList
     * @param size
     * @return
     */
    default int insertBatchSomeColumn(List<T> entityList, int size) {
        if (CollectionUtil.isEmpty(entityList)) {
            return 0;
        }
        List<List<T>> split = CollectionUtil.split(entityList, size);
        return split.stream().mapToInt(this::insertBatchSomeColumn).sum();
    }
}
