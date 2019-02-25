/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PrivateSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PrivateSchool ps = new PrivateSchool();
        //Course course1 = new Course();
        
        Scanner sc = new Scanner(System.in);
        while(true){
        switch (ps.userSelect("Please choose an option:\n1.Enter new Student\n2.Enter new Trainer"
                + "\n3.Enter new Assignment\n4.Exit", 5)) {
            case 1:
                StudentDetails studentDetails = new StudentDetails();
                ArrayList<Student> students = new ArrayList<Student>();
                studentDetails.getMultipleStudents(sc, students);
                break;

            case 2:
                TrainerDetails trainerDetails = new TrainerDetails();
                ArrayList<Trainer> trainers = new ArrayList<Trainer>();
                trainerDetails.getMultipleStudents(sc, trainers);
                break;
            case 3:
                AssignmentDetails assignmentDetails = new AssignmentDetails();
                ArrayList<Assignment> assignments = new ArrayList<Assignment>();
                assignmentDetails.getMultipleAssignments(sc, assignments);
                break;
            case 4:
                System.exit(0);
        }
        }
    }

    public int userSelect(String str, int numberOfOptions) {
        int userInput = 0;
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        while (true) {

            try {
                userInput = sc.nextInt();
                if (userInput > 0 && userInput < numberOfOptions) {
                    break;
                } else {
                    System.out.println("This is not a valid choice!");
                }
                continue;
            } catch (InputMismatchException exception) {
                //Print 
                //when user put other than integer
                System.out.println("This is not an integer");
                sc.next();
                continue;
            }
        }
        return userInput;
    }

    /**public void Manager() {

    }**/
}
