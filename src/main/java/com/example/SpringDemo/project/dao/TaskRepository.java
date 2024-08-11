package com.example.SpringDemo.project.dao;


import com.example.SpringDemo.project.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task> findByUserid(int user);
}
