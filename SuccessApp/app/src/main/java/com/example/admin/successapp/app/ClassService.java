/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import core.domain.Student;
import core.domain.Class;
import core.domain.repository.ClassRepository;

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
