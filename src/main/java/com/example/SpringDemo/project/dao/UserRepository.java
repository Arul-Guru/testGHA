package com.example.SpringDemo.project.dao;


import com.example.SpringDemo.project.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
