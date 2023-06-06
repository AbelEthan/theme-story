package com.qxm.common.enums;

/**
 * @ClassName: {@link StatusEnum}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/5/31 17:30
 * @Describes 朝代枚举
 */
public enum StatusEnum implements IBaseEnum {

    ENABLE(1, "启用"),
    DISABLE(0, "停用"),

    ;
    private Integer key;
    private String value;

    StatusEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Integer getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }
}
