package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourseManagement courseManagement = new CourseManagement();
        Teacher teacher = new Teacher("Nguyen Van A");
        Course course = new Course("Java Programming", teacher);
        courseManagement.setCourse(course);

        System.out.println("Thông tin chi tiết của trung tâm:");
        System.out.println("Quản lý lớp học: " + courseManagement.getCourse().getTeacher().getName());
        System.out.println("Giảng viên: " + courseManagement.getCourse().getTeacher().getName());
        System.out.println("Lớp học: " + courseManagement.getCourse().getName());
        System.out.println();

        Student student1 = new Student(1, "Nguyen Van B", 20, 8.5);
        Student student2 = new Student(2, "Tran Thi C", 22, 7.8);
        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Thông tin học viên trong lớp:");
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Tên: " + student.getName());
            System.out.println("Tuổi: " + student.getAge());
            System.out.println("Học lực: " + student.getAcademicPerformance());
            System.out.println();
        }

        int studentIdToUpdate = 1;
        double newAcademicPerformance = 9.0;
        course.updateStudentAcademicPerformance(studentIdToUpdate, newAcademicPerformance);

        System.out.println("Thông tin học viên sau khi cập nhật:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Tên: " + student.getName());
            System.out.println("Tuổi: " + student.getAge());
            System.out.println("Học lực: " + student.getAcademicPerformance());
            System.out.println();
        }

        int studentIdToDelete = 2;
        course.removeStudent(studentIdToDelete);

        System.out.println("Thông tin học viên sau khi xóa:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Tên: " + student.getName());
            System.out.println("Tuổi: " + student.getAge());
            System.out.println("Học lực: " + student.getAcademicPerformance());
            System.out.println();
        }
    }
}
