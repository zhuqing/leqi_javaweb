package com.leqienglish.model;

/**
 * Created by zhuqing on 2017/7/23.
 */
public class Page {
    private Integer page;
    private Integer pageSize;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getStartIndex(){
       return (this.getPage()-1)*this.getPageSize();
    }
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
