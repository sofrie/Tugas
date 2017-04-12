/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blibli.forms;

/**
 *
 * @author sofri
 */
public class UpdateRole {
    private String name;
    private Integer IsDeleted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Integer IsDeleted) {
        this.IsDeleted = IsDeleted;
    }
    
}
