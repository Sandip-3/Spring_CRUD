package com.project.application.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.application.model.RegisterModel;
import com.project.application.service.RegisterService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class RegisterController {

    @Autowired
    private RegisterService registerService;
    
    @PostMapping("/register/user")
    public RegisterModel registerUser(@RequestBody RegisterModel registerModel) {
        return registerService.saveUser(registerModel);
    }

    @GetMapping("/get/users")
    public ArrayList<RegisterModel> getUser() {
        return registerService.getUser();
    }
    
    @GetMapping("get/user/{userID}")
    public RegisterModel getUser(@PathVariable Integer userID) {
        return registerService.getUser(userID);
    }

    @DeleteMapping("delete/user/{userID}")
    public String deleteUser(@PathVariable Integer userID) {
        return registerService.deleteUser(userID);
    }
    
    @PutMapping("/update/user")
    public RegisterModel updateUser(@RequestBody RegisterModel registerModel) {
       return  registerService.updateUser(registerModel);
    }
    
}
