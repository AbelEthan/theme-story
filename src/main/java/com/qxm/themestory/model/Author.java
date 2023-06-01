package com.qxm.themestory.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Title: {@link Author}
 * Description: 古代人物对象
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:10
 */
@Data
@NoArgsConstructor
@TableName("author")
public class Author implements Serializable {

  /**
   * 主键
   */
  @TableId(type = IdType.AUTO)
  private Integer id;

  /**
   * 姓名
   */
  private String name;

  /**
   * 朝代
   */
  private String dynasty;

  /**
   * 长介绍
   */
  private String longDesc;

  /**
   * 短介绍
   */
  private String shortDesc;
}
