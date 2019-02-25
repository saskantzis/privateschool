/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;

import java.util.ArrayList;

public class StudentsPerCourse {
    public Course course;
    public ArrayList<Student> students;
    
    public StudentsPerCourse(Course course, ArrayList<Student> students) {
        this.course = course;
        this.students = students;
    }
    
}
