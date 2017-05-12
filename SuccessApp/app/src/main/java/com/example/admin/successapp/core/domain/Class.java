/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Class {

    private String id;
    private String name;
    private int level;
    private Teacher teacherHomeroom;
    private List<SubjectPoint> subjectPoints;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Teacher getTeacherHomeroom() {
        return teacherHomeroom;
    }

    public void setTeacherHomeroom(Teacher teacherHomeroom) {
        this.teacherHomeroom = teacherHomeroom;
    }

    public List<SubjectPoint> getSubjectPoints() {
        return subjectPoints;
    }

    public void setSubjectPoints(List<SubjectPoint> subjectPoints) {
        this.subjectPoints = subjectPoints;
    }

    public void addStudent(Student student) {
        List<SubjectPoint> subjectPoints = this.getSubjectPoints();
        SubjectPoint subjectPointEnd = new SubjectPoint();
        subjectPointEnd.setPoints(subjectPoints.get(0).getPoints());
        subjectPointEnd.setStudent(student);
        subjectPointEnd.setSubjects(subjectPoints.get(0).getSubjects());
        subjectPoints.add(subjectPointEnd);
        this.setSubjectPoints(subjectPoints);
    }

    public boolean checkExistStudent(Student student) {
        boolean checkExist = false;
        for (SubjectPoint subjectPoint : this.getSubjectPoints()) {
            if (subjectPoint.getStudent().getId().equals(student.getId())) {
                checkExist = true;
                break;

            }
        }
        return checkExist;

    }

    public void removeStudent(Student student) {
        int index = 0;
        for (SubjectPoint subjectPoint : this.getSubjectPoints()) {
            if (subjectPoint.getStudent().getId().equals(student.getId())) {
                this.getSubjectPoints().remove(index);
                break;
            }
            index++;
        }
    }

    public static Class creatClass(String name, int level, Teacher teacher, List<Subjects> subjectses, List<Student> students) {
        Class classInfo = new Class();
        classInfo.setId("");//ramdom Id
        classInfo.setLevel(level);
        classInfo.setName(name);
        classInfo.setTeacherHomeroom(teacher);
        List<SubjectPoint> subjectPoints = new ArrayList<>();
        for (Subjects subjects : subjectses) {
            for (Student student : students) {
                SubjectPoint subjectPoint = new SubjectPoint();
                subjectPoint.setPoints(new ArrayList<>());
                subjectPoint.setStudent(student);
                subjectPoint.setSubjects(subjects);
                subjectPoints.add(subjectPoint);
            }
        }
        classInfo.setSubjectPoints(subjectPoints);
        return classInfo;
    }
}
