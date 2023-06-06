package com.qxm.poetry.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Title: {@link PoetryImageVO}
 * Description: 图片对象
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:10
 */
@Data
@NoArgsConstructor
public class PoetryImageVO {

    private Long id;

    /**
     * 图片地址
     */
    private String url;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 状态值
     */
    private String statusValue;

    /**
     * 排序
     */
    private Integer open;

}
