/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AssignmentDetails extends Assignment{
    
    public Assignment getDetails(Scanner sc) {
        Assignment assignment1 = new Assignment();
        System.out.println("Please give me the assignment's title: ");
        assignment1.setAssignmentTitle(sc.next()); 
        System.out.println("Please give me the assignment's description: ");
        assignment1.setAssignmentDescription(sc.next());
        System.out.println("Assignment Date: ");
        assignment1.setAssigmentDate(sc.next());
        System.out.println("Oral Mark: ");
        assignment1.setOralMark(sc.nextDouble());
        System.out.println("Total Mark: ");
        assignment1.setTotalMark(sc.nextDouble());
        
        return(assignment1);
    }
    
    public ArrayList<Assignment> getMultipleAssignments(Scanner sc, ArrayList<Assignment> assignments){
        boolean evaluateUsersInput;
    do{    
        assignments.add(getDetails(sc));
        System.out.println("Please type next to continue or quit to exit");
        evaluateUsersInput= sc.next().equals("quit");
        }while(!evaluateUsersInput);
        return assignments;
        
    }
    
}
