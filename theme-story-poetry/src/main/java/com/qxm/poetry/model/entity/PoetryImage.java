package com.qxm.poetry.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.qxm.common.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Title: {@link PoetryImage}
 * Description: 图片对象
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("poetry_image")
public class PoetryImage extends BaseEntity {

    /**
     * 图片地址
     */
    private String url;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer open;

}
