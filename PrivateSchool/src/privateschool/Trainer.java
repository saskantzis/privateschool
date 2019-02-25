/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;

public class Trainer {
    
    private String firstName;
    private String lastName;
    private String subject;
    
    Trainer(){}
    
    Trainer(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }
    
    @Override
    public String toString() {
        return " First Name : "  + firstName + 
               " Last Name: "    + lastName + 
               " Subject: "      + subject;
    }
    
}
