package com.qxm.poetry.model.vo;

import com.ejlchina.searcher.bean.DbField;
import com.ejlchina.searcher.bean.DbIgnore;
import com.ejlchina.searcher.bean.SearchBean;
import com.ejlchina.searcher.bean.SortType;
import com.ejlchina.searcher.operator.Between;
import com.ejlchina.searcher.operator.Equal;
import com.ejlchina.searcher.operator.StartWith;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Title: {@link PoetryAuthorVO}
 * Description: 古代人物对象
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:10
 */
@Data
@NoArgsConstructor
@SearchBean(
        sortType = SortType.ONLY_ENTITY,
        orderBy = "sort asc",
        tables = "poetry_image"
)
public class PoetryAuthorVO {

    @DbField(conditional = false)
    private Long id;

    /**
     * 姓名
     */
    @DbField(onlyOn = {StartWith.class})
    private String name;

    /**
     * 出生日期
     */
    @DbField(onlyOn = {Between.class})
    private String birthYear;

    /**
     * 死亡日期
     */
    @DbField(onlyOn = {Between.class})
    private String deathYear;

    /**
     * 描述
     */
    @DbField(conditional = false)
    private String desc;

    /**
     * 朝代
     */
    @DbField(onlyOn = {Equal.class})
    private String dynasty;

    /**
     * 百度百科地址
     */
    @DbField(conditional = false)
    private String baiduWiki;

    /**
     * 状态
     */
    @DbField(onlyOn = {Equal.class})
    private Integer status;

    /**
     * 状态值
     */
    @DbIgnore
    private String statusValue;

    /**
     * 排序
     */
    @DbField(conditional = false)
    private Long sort;

    /**
     * 作品数量
     */
    @DbField(onlyOn = {Between.class})
    private Integer worksCount;

}
