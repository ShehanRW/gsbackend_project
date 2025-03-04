package com.gsbe.gsbackend_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gsbe.gsbackend_project.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {
    
}
