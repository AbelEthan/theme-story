package com.qxm.common.model;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qxm.common.constants.PageConstant;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title: {@link PageParams}
 * Description: 分页参数
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/7 14:27
 */
public class PageParams extends Page implements Serializable {
    private static final long serialVersionUID = 1990620302366533900L;

    private int page = PageConstant.DEFAULT_PAGE;
    private int limit = PageConstant.DEFAULT_LIMIT;
    private String sort;
    private String order;
    private Map<String, Object> requestMap = new HashMap<>();

    /**
     * 排序
     */
    private String orderBy;

    public PageParams(List<?> records, Integer total) {
        super.setRecords(records).setTotal(total);
    }

    public PageParams() {
        requestMap = new HashMap<>();
    }

    public PageParams(Map map) {
        if (ObjectUtils.isNull(map)) {
            map = new HashMap<>();
        }
        this.page = Integer.parseInt(map.getOrDefault(PageConstant.PAGE_KEY, PageConstant.DEFAULT_PAGE).toString());
        this.limit = Integer.parseInt(map.getOrDefault(PageConstant.PAGE_LIMIT_KEY, PageConstant.DEFAULT_LIMIT).toString());
        this.sort = (String) map.getOrDefault(PageConstant.PAGE_SORT_KEY, "");
        this.order = (String) map.getOrDefault(PageConstant.PAGE_ORDER_KEY, "");
        super.setCurrent(page);
        super.setSize(limit);
        map.remove(PageConstant.PAGE_KEY);
        map.remove(PageConstant.PAGE_LIMIT_KEY);
        map.remove(PageConstant.PAGE_SORT_KEY);
        map.remove(PageConstant.PAGE_ORDER_KEY);
        requestMap.putAll(map);
    }

    public PageParams(int page, int limit) {
        this.page = page;
        this.limit = limit;
    }

    public PageParams(int page, int limit, String sort, String order) {
        this.page = page;
        this.limit = limit;
        this.sort = sort;
        this.order = order;
    }

    public int getPage() {
        if (page <= PageConstant.MIN_PAGE) {
            page = 1;
        }
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
//        if (limit > PageConstant.MAX_LIMIT) {
//            limit = PageConstant.MAX_LIMIT;
//        }
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Map<String, Object> getRequestMap() {
        return requestMap;
    }

    public void setRequestMap(Map<String, Object> requestMap) {
        this.requestMap = requestMap;
    }

    public String getOrderBy() {
        if (StringUtils.isBlank(order)) {
            order = "asc";
        }
        if (StringUtils.isNotBlank(sort)) {
            this.setOrderBy(String.format("%s %s", StringUtils.camelToUnderline(sort), order));
        }
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
