package com.qxm.poetry.model.vo;

import com.ejlchina.searcher.bean.DbField;
import com.ejlchina.searcher.bean.DbIgnore;
import com.ejlchina.searcher.bean.SearchBean;
import com.ejlchina.searcher.bean.SortType;
import com.ejlchina.searcher.operator.Contain;
import com.ejlchina.searcher.operator.Equal;
import lombok.Data;

/**
 * @ClassName: {@link PoetryTextbookVO}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/6/8 17:27
 * @Describes
 */
@Data
@SearchBean(
        tables = "poetry_textbook pt left join poetry_image pi on pt.image_id = pi.id",
        sortType = SortType.ONLY_ENTITY,
        orderBy = "type asc, sort asc"
)
public class PoetryTextbookVO {
    @DbField(value = "pt.id", conditional = false)
    private Long id;

    /**
     * 类型
     */
    @DbField(value = "pt.type", onlyOn = {Equal.class})
    private Integer type;

    /**
     * 类型值
     */
    @DbIgnore
    private String typeValue;

    /**
     * 名称
     */
    @DbField(value = "pt.name", onlyOn = {Contain.class})
    private String name;

    /**
     * 图片id
     */
    @DbField(value = "pt.image_id", conditional = false)
    private Long imageId;

    /**
     * 图片地址
     */
    @DbField(value = "pi.url", conditional = false)
    private String imageUrl;

    /**
     * 介绍
     */
    @DbField(value = "pt.content", conditional = false)
    private String content;

    /**
     * 百度百科地址
     */
    @DbField(value = "pt.baidu_wiki", conditional = false)
    private String baiduWiki;

    /**
     * 状态
     */
    @DbField(value = "pt.status", onlyOn = {Equal.class})
    private Integer status;

    /**
     * 状态值
     */
    @DbIgnore
    private String statusValue;

    /**
     * 排序
     */
    @DbField(value = "pt.sort", conditional = false)
    private Long sort;
}
