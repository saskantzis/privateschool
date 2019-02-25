/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails extends Student {
    
    public Student getDetails(Scanner sc) {
        Student student1 = new Student();
        System.out.println("Please give me Student's First Name: ");
        student1.setFirstName(sc.next()); 
        System.out.println("Please give me Student's Last Name: ");
        student1.setLastName(sc.next());
        System.out.println("Date of Birth: ");
        student1.setDateOfBirth(sc.next());
        System.out.println("Tuition Fees: ");
        student1.setTuitionFees(sc.nextDouble());
        
        return(student1);
    }
    
    public ArrayList<Student> getMultipleStudents(Scanner sc, ArrayList<Student> students){
        boolean evaluateUsersInput;
    do{    
        students.add(getDetails(sc));
        System.out.println("Please type next to continue or quit to exit");
        evaluateUsersInput= sc.next().equals("quit");
        }while(!evaluateUsersInput);
        return students;
        
    }
    
}
