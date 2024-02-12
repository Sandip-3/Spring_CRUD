package com.project.application.service;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.application.dao.RegisterDao;
import com.project.application.model.RegisterModel;

@Service
public class RegisterService {
    @Autowired
    private RegisterDao registerDao;

    public RegisterModel saveUser(RegisterModel registerModel) {
        return registerDao.save(registerModel);
    }
    
    public ArrayList<RegisterModel> getUser() {
        ArrayList<RegisterModel> users = new ArrayList<>();
        registerDao.findAll().forEach(e -> users.add(e));
        return users;
    }

    public RegisterModel getUser(Integer userID) {
        return registerDao.findById(userID).orElseThrow();
    }

    public String deleteUser(Integer userID) {
        registerDao.deleteById(userID);
        return "Delete Successs";
    }
    
    public RegisterModel updateUser(RegisterModel registerModel) {
        registerDao.findById(registerModel.getUserID()).orElseThrow();
        return registerDao.save(registerModel);
    }
}
