/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainerDetails extends Trainer{
    
    public Trainer getDetails(Scanner sc) {
        Trainer trainer1 = new Trainer();
        System.out.println("Please give me Trainer's First Name: ");
        trainer1.setFirstName(sc.next()); 
        System.out.println("Please give me TRainer's Last Name: ");
        trainer1.setLastName(sc.next());
        System.out.println("Subject: ");
        trainer1.setSubject(sc.next());
        return(trainer1);
    }
    
    public void getMultipleStudents(Scanner sc, ArrayList<Trainer> trainers){
        boolean evaluateUsersInput;
    do{
        trainers.add(getDetails(sc));
        System.out.println("Please type next to continue or quit to exit");
        evaluateUsersInput= sc.next().equals("quit");
        }while(!evaluateUsersInput);
    }
    
}
