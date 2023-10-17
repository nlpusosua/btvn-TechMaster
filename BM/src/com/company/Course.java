package com.company;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                students.remove(student);
                break;
            }
        }
    }

    public void updateStudentAcademicPerformance(int studentId, double newAcademicPerformance) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                student.setAcademicPerformance(newAcademicPerformance);
                break;
            }
        }
    }
}
