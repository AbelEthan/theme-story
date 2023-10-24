package com.qxm.poetry.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.qxm.common.model.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Title: {@link PoetryWork}
 * Description: 作品对象
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:10
 */
@Data
@NoArgsConstructor
@TableName("poetry_work")
public class PoetryWork extends BaseEntity {

    /**
     * 标题
     */
    private String title;

    /**
     * 作者id
     */
    private Long authorId;

    /**
     * 作者
     */
    private String author;

    /**
     * 朝代id
     */
    private Long dynastyId;

    /**
     * 朝代
     */
    private String dynasty;

    /**
     * 体裁拼音
     */
    private String kind;

    /**
     * 体裁
     */
    private String kindCn;

    /**
     * 百度百科地址
     */
    private String baiduWiki;

    /**
     * 内容
     */
    private String content;

    /**
     * 评析
     */
    private String intro;

    /**
     * 注释
     */
    private String annotation;

    /**
     * 译文
     */
    private String translation;

    /**
     * 辑评
     */
    private String masterComment;

    /**
     * 语句
     */
    private String quote;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 排序
     */
    private Long sort;

}
