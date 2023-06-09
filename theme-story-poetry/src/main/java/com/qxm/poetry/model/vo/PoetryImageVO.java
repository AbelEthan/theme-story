package com.qxm.poetry.model.vo;

import com.ejlchina.searcher.bean.DbField;
import com.ejlchina.searcher.bean.DbIgnore;
import com.ejlchina.searcher.bean.SearchBean;
import com.ejlchina.searcher.bean.SortType;
import com.ejlchina.searcher.operator.Equal;
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
@SearchBean(
        sortType = SortType.ONLY_ENTITY,
        tables = "poetry_image"
)
public class PoetryImageVO {

    @DbField(value = "id", conditional = false)
    private Long id;

    /**
     * 图片地址
     */
    @DbField(value = "url", conditional = false)
    private String url;

    /**
     * 状态
     */
    @DbField(value = "status", onlyOn = {Equal.class})
    private Integer status;

    /**
     * 状态值
     */
    @DbIgnore
    private String statusValue;

    /**
     * 打开方式
     */
    @DbField(value = "open",onlyOn = {Equal.class})
    private Integer open;

}
