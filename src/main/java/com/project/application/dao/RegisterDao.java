package com.project.application.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.application.model.RegisterModel;

@Repository
public interface RegisterDao extends CrudRepository<RegisterModel , Integer>{
    
}
