/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blibli.controllers;

import com.blibli.forms.CreateUser;
import com.blibli.forms.LoginUser;
import com.blibli.forms.UpdateUser;
import com.blibli.models.User;
import com.blibli.models.Paging;
import com.blibli.models.Response;
import java.util.Arrays;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sofri
 */
@RestController
public class UserController {
    //api/users/
    
    //get all user
    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public Response<User> list(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "item_page", defaultValue = "100") int item_page) {
        Response<User> response = new Response<>();
        response.setCode(200);
        response.setStatus("OK");
        response.setList(Arrays.asList(
                new User(1,"User1", "NamaUser1","PasswordUser1",1,1),
                new User(2,"User2", "NamaUser2","PasswordUser2",1,1)
        ));
        response.setPaging(
                new Paging(page, item_page, 33)
        );
        return response;
    }

    //api/users
    //create data
    @RequestMapping(value = "/api/users", method = RequestMethod.POST)
    public Response<User> create(@RequestBody CreateUser request) {
		Response<User> response=new Response<>();
		response.setCode(200);
		response.setStatus("OK");
                User user=new User(request.getId(), request.getUsername(),request.getName(), request.getPw(), request.getRole(),request.getStatus());
		response.setData(user);
		return response;
    }

    //update
    @RequestMapping(value = "/api/users/{id}", method = RequestMethod.PUT)
    public Response<User> update(@PathVariable("id") Integer id, @RequestBody UpdateUser request) {
        Response<User> response = new Response<>();
        response.setCode(200);
        response.setStatus("OK");
        User user=new User(id, request.getUsername(),request.getName(), request.getPw(), request.getRole(),request.getStatus());
        response.setData(user);
        return response;
    }

    //delete
    @RequestMapping(value = "/api/users/{id}", method = RequestMethod.DELETE)
    public Response<User> delete(@PathVariable("id") Integer id, @RequestBody UpdateUser request) {
        Response<User> response = new Response<>();
        response.setCode(200);
        response.setStatus("OK");
        User user=new User(id, request.getUsername(),request.getName(), request.getPw(), request.getRole(),0);
        response.setData(user);
        return response;
    }

    //login user
    @RequestMapping(value = "/api/users/_login", method = RequestMethod.POST)
    public Response<User> login(@RequestBody LoginUser request) {
		Response<User> response=new Response<>();
		response.setCode(200);
		response.setStatus("OK");
                User user=new User(request.getUsername(), request.getPw());
		response.setData(user);
		return response;
    }
    
    public void validateCreateRequest(CreateUser request) {
        if (request.getId() == null) {
            throw new IllegalArgumentException("Id tidak boleh kosong");
        }
        if (request.getName() == null) {
            throw new IllegalArgumentException("Name tidak boleh kosong");
        }
    }
}
