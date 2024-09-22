/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6_fake;

import java.util.ArrayList;

/**
 *
 * @author copbu
 */
public class StudentManager {
    ArrayList<Student> list = new ArrayList<>();
    
    public Student FindStudentByID(String studentID){
        for(Student stu: list){
            if(studentID.equalsIgnoreCase(stu.getStudentID())){
                return stu;
            }}
        return null;
        }
    
    public boolean AddStudent(Student student){
         for(Student s: list){
            if(s.getStudentID().equalsIgnoreCase(student.getStudentID())){
                return false;
            }}
        list.add(student);
         return true;       
        }
    
     public ArrayList<Student> getStudents() {
        return list;
    }
    
    }

