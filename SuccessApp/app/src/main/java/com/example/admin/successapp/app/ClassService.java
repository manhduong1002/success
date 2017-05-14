/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.admin.successapp.app;

import com.example.admin.successapp.core.domain.Student;
import com.example.admin.successapp.core.domain.Class;
import com.example.admin.successapp.core.domain.repository.ClassRepository;

/**
 *
 * @author admin
 */
public class ClassService {

    private ClassRepository classRepository;

    public void addStudent(Student student, String classId) {
        Class classInfo = this.classRepository.find(classId);
        classInfo.addStudent(student);
        this.classRepository.update(classInfo);
    }
    public  void removeStudent(Student student, String classId){
        Class classInfo = this.classRepository.find(classId);
        classInfo.removeStudent(student);
        this.classRepository.update(classInfo);        
    }
}
