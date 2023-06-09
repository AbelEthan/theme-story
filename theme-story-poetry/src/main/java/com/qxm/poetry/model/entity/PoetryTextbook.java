package com.qxm.poetry.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.qxm.common.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Title: {@link PoetryTextbook}
 * Description: 书本对象
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/6/8 10:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("poetry_textbook")
public class PoetryTextbook extends BaseEntity {

    /**
     * 类型
     */
    private Integer type;

    /**
     * 名称
     */
    private String name;

    /**
     * 图片id
     */
    private Long imageId;


    /**
     * 介绍
     */
    private String content;

     /**
     * 百度百科地址
     */
    private String baiduWiki;


    /**
     * 状态
     */
    private Integer status;


    /**
     * 排序
     */
    private Long sort;
}
