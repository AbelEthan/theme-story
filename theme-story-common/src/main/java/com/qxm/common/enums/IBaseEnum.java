package com.qxm.common.enums;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author AbelEthan
 * @email AbelEthan@126.com
 * @date 2020-12-11 10:06:21
 * @desc 该工具只适用于 ENUM(Integer, String)这样的枚举
 */
public interface IBaseEnum {

    /**
     * 获取ｋｅｙ
     *
     * @return
     */
    Integer getKey();

    /**
     * 获取ｖａｌｕｅ
     *
     * @return
     */
    String getValue();

    /**
     * 检测枚举值是否存在
     *
     * @param value
     * @param clazz
     * @param <E>
     * @return
     */
    static <E extends Enum<E> & IBaseEnum> Boolean check(String value, Class<E> clazz) {
        Objects.requireNonNull(value);
        EnumSet<E> all = EnumSet.allOf(clazz);
        for (E e : all) {
            if (e.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 根据ｋｅｙ获取枚举
     *
     * @param key
     * @param clazz
     * @param <E>
     * @return
     */
    static <E extends Enum<E> & IBaseEnum> String getEnumValue(Integer key, Class<E> clazz) {
        if (ObjectUtil.isEmpty(key)) {
            return null;
        }
        EnumSet<E> all = EnumSet.allOf(clazz);
        E anElse = all.stream()
                .filter(e -> e.getKey().equals(key))
                .findFirst()
                .orElse(null);
        return anElse == null ? null : anElse.getValue();
    }

    /**
     * 根据ｋｅｙ获取枚举
     *
     * @param key
     * @param clazz
     * @param <E>
     * @return
     */
    static <E extends Enum<E> & IBaseEnum> String coverEnumValue(Object key, Class<?> clazz) {
        if (ObjectUtil.isEmpty(key)) {
            return null;
        }
        EnumSet<E> all = EnumSet.allOf((Class<E>) clazz);
        E anElse = all.stream()
                .filter(e -> e.getKey().equals(key))
                .findFirst()
                .orElse(null);
        return anElse == null ? null : anElse.getValue();
    }

    /**
     * 根据value获取枚举
     *
     * @param value
     * @param clazz
     * @param <E>
     * @return
     */
    static <E extends Enum<E> & IBaseEnum> Integer getEnumKey(String value, Class<E> clazz) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        EnumSet<E> all = EnumSet.allOf(clazz);
        E anElse = all.stream()
                .filter(e -> e.getValue().equals(value))
                .findFirst()
                .orElse(null);
        return anElse == null ? null : anElse.getKey();
    }


    /**
     * 获取枚举ｍａｐ列表
     *
     * @param clazz
     * @param <E>
     * @return
     */
    static <E extends Enum<E> & IBaseEnum> List<Map<String, Object>> getMapList(Class<E> clazz) {
        EnumSet<E> all = EnumSet.allOf(clazz);
        List<Map<String, Object>> list = new ArrayList<>(all.size());
        Map<String, Object> map = null;
        for (E e : all) {
            map = new HashMap<>(2);
            map.put("key", e.getKey());
            map.put("value", e.getValue());
            list.add(map);
        }
        return list;
    }

    /**
     * 获取枚举键map
     *
     * @param clazz
     * @param <E>
     * @return
     */
    static <E extends Enum<E> & IBaseEnum> Map<Integer, String> getKeyMap(Class<E> clazz) {
        EnumSet<E> all = EnumSet.allOf(clazz);
        Map<Integer, String> map = new HashMap(all.size());
        all.stream().forEach(e -> {
            map.put(e.getKey(), e.getValue());
        });
        return map;
    }

    /**
     * 获取枚举值map
     *
     * @param clazz
     * @param <E>
     * @return
     */
    static <E extends Enum<E> & IBaseEnum> Map<String, Integer> getValueMap(Class<E> clazz) {
        EnumSet<E> all = EnumSet.allOf(clazz);
        Map<String, Integer> map = new HashMap(all.size());
        all.stream().forEach(e -> {
            map.put(e.getValue(), e.getKey());
        });
        return map;
    }


}
