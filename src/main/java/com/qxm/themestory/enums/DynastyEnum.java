package com.qxm.themestory.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: {@link DynastyEnum}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/5/31 17:30
 * @Describes 朝代枚举
 */
public enum DynastyEnum {

    TANG("唐"),
    FIVE_DYNASTIES("五代"),
    SONG("宋"),
    YUAN("元"),

    ;
    private String name;

    DynastyEnum(String name) {
        this.name = name;
    }

    public static List<String> getList(){
        DynastyEnum[] dynastyEnums = values();
        List<String> dynastyList = new ArrayList<>(dynastyEnums.length);
        for (DynastyEnum dynastyEnum : dynastyEnums) {
            dynastyList.add(dynastyEnum.name);
        }
        return dynastyList;
    }
}
