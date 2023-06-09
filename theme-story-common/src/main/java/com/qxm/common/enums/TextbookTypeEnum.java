package com.qxm.common.enums;

/**
 * @ClassName: {@link TextbookTypeEnum}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/6/8 17:15
 * @Describes
 */
public enum TextbookTypeEnum implements IBaseEnum{
    PRIMARY(1, "小学"),
    JUNIOR_HIGH(2, "初中"),
    HIGH(3, "高中"),
    ALLUSION(4, "用典"),
    ANTHOLOGY(5, "选集"),
    BRAND(6, "词牌"),
    CITY(7, "城市"),
    DYNASTY(8, "朝代"),
    FAMOUS(9, "名山"),
    FESTIVAL(10, "节日"),
    FLOWER(11, "花卉"),
    GEOGRAPHY(12, "地理"),
    SCENERY(13, "写景"),
    SEASONS(14, "时令"),
    SOLAR_TERM(15, "节气"),
    THEME(16, "主题"),
    TIME(17, "时间"),
    ;

    ;
    private Integer key;
    private String value;

    TextbookTypeEnum(Integer key, String value) {
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
