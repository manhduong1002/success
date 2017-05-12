/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.admin.successapp.core.domain.repository;

import com.example.admin.successapp.core.domain.Student;
import java.util.List;

/**
 *
 * @author admin
 */
public interface StudentRepository {
    public void add(Student student);
    public void update(Student student);
    public void delete(String studentId);
    public List<Student> find(String keyword);
}
