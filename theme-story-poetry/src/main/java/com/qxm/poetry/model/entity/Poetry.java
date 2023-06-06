package com.qxm.poetry.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Title: {@link Poetry}
 * Description: 古诗词对象
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:10
 */
@Data
@NoArgsConstructor
@TableName("poetry")
public class Poetry implements Serializable {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 作者
     */
    private String author;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 朝代
     */
    private String dynasty;

    /**
     * 预言
     */
    private String prologue;

    /**
     * 扩展
     */
    private String extend;


    /**
     * 标签
     */
    private String tag;

}
