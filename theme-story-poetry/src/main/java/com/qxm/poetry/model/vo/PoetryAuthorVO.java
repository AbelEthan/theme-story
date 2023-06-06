package com.qxm.poetry.model.vo;

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
public class PoetryAuthorVO {

    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 出生日期
     */
    private String birthYear;

    /**
     * 死亡日期
     */
    private String deathYear;

    /**
     * 描述
     */
    private String desc;

    /**
     * 朝代
     */
    private String dynasty;

    /**
     * 百度百科地址
     */
    private String baiduWiki;

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
    private Long sort;

    /**
     * 作品数量
     */
    private Integer worksCount;

}
