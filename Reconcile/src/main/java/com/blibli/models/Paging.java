/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blibli.models;

/**
 *
 * @author sofri
 */
public class Paging {
    private Integer page;
    private Integer item_page;
    private Integer total_page;

    public Paging(Integer page, Integer item_page, Integer total_page) {
        this.page = page;
        this.item_page = item_page;
        this.total_page = total_page;
    }
    

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getItem_page() {
        return item_page;
    }

    public void setItem_page(Integer item_page) {
        this.item_page = item_page;
    }

    public Integer getTotal_page() {
        return total_page;
    }

    public void setTotal_page(Integer total_page) {
        this.total_page = total_page;
    }
}
