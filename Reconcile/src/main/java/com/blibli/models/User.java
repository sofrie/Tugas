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
public class User {
    private Integer id;
    private String username;    
    private String pw;
    private String name;
    private Integer role;
    private Integer status;

    public User(String username, String pw) {
        this.username = username;
        this.pw = pw;
    }

    
    
    public User(Integer id, String username, String name, String pw, Integer role, Integer status) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.pw = pw;
        this.role = role;
        this.status = status;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }   

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    
}
