package com.qxm.poetry.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.qxm.common.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Title: {@link PoetryAuthor}
 * Description: 古代人物对象
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("poetry_author")
public class PoetryAuthor extends BaseEntity {

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
     * 排序
     */
    private Long sort;

    /**
     * 作品数量
     */
    private Integer worksCount;

}
