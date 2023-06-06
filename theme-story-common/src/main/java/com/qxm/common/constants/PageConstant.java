package com.qxm.common.constants;

/**
 * Title: {@link PageConstant}
 * Description: 分页常量
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/7/3 11:52
 */
public class PageConstant {

    /**
     * 默认最小页码
     */
    public static final int MIN_PAGE = 0;

    /**
     * 最大显示条数
     */
    public static final int MAX_LIMIT = 999;

    /**
     * 默认页码
     */
    public static final int DEFAULT_PAGE = 1;
    /**
     * 默认显示条数
     */
    public static final int DEFAULT_LIMIT = 10;

    /**
     * 页码 KEY
     */
    public static final String PAGE_KEY = "page";

    /**
     * 显示条数 KEY
     */
    public static final String PAGE_LIMIT_KEY = "limit";

    /**
     * 排序字段 KEY
     */
    public static final String PAGE_SORT_KEY = "sort";

    /**
     * 排序方向 KEY
     */
    public static final String PAGE_ORDER_KEY = "order";
}
