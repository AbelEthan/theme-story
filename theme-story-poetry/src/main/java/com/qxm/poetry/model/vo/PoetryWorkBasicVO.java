package com.qxm.poetry.model.vo;

import com.ejlchina.searcher.bean.DbField;
import com.ejlchina.searcher.bean.SearchBean;
import com.ejlchina.searcher.bean.SortType;
import com.ejlchina.searcher.operator.Equal;
import com.ejlchina.searcher.operator.StartWith;
import lombok.Data;

/**
 * @ClassName: {@link PoetryWorkBasicVO}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/6/9 16:31
 * @Describes
 */
@Data
@SearchBean(
        tables = "poetry_work pw",
        sortType = SortType.ONLY_ENTITY,
        where = "pw.status = 1"
)
public class PoetryWorkBasicVO {
    @DbField(conditional = false)
    private Long id;
    @DbField(onlyOn = {StartWith.class})
    private String title;
    @DbField(onlyOn = {Equal.class})
    private Long authorId;
    @DbField(conditional = false)
    private String author;
    @DbField(onlyOn = {Equal.class})
    private Long dynastyId;
    @DbField(conditional = false)
    private String dynasty;
    @DbField(conditional = false)
    private String content;
}
