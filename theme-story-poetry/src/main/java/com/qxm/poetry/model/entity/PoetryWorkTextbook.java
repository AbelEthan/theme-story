package com.qxm.poetry.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName: {@link PoetryWorkTextbook}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/6/9 15:39
 * @Describes 书本和作品关联对象
 */
@Data
@NoArgsConstructor
@TableName("poetry_work_textbook")
public class PoetryWorkTextbook {
    /**
     * 作品id
     */
    private Long workId;
    /**
     * 书本id
     */
    private Long textbookId;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    public Date createTime;
}
