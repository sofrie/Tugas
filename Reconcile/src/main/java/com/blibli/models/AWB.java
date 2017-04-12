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
public class AWB {
    private String id;
    private Integer correct;
    private Integer wrong;
    private Integer status;//status AWB nya not approval, checked, approval
    private Integer isDeleted;
    private Double discount;
    private Double vAT;
    private Double subtotal;
    private Double grandTotal;
    private String batch;

    public AWB(String id, Integer correct, Integer wrong, Integer status, Integer isDeleted, String batch) {
        this.id = id;
        this.correct = correct;
        this.wrong = wrong;
        this.status = status;
        this.isDeleted = isDeleted;
        this.batch = batch;
    }

    
    public AWB(String id, Integer correct, Integer wrong, Integer status, Integer isDeleted, Double discount, Double vAT, Double subtotal, Double grandTotal, String batch) {
        this.id = id;
        this.correct = correct;
        this.wrong = wrong;
        this.status = status;
        this.isDeleted = isDeleted;
        this.discount = discount;
        this.vAT = vAT;
        this.subtotal = subtotal;
        this.grandTotal = grandTotal;
        this.batch = batch;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCorrect() {
        return correct;
    }

    public void setCorrect(Integer correct) {
        this.correct = correct;
    }

    public Integer getWrong() {
        return wrong;
    }

    public void setWrong(Integer wrong) {
        this.wrong = wrong;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getvAT() {
        return vAT;
    }

    public void setvAT(Double vAT) {
        this.vAT = vAT;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
    
    
    
}
