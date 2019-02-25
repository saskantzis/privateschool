/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;

public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double tuitionFees;
    
    Student(String firstName, String lastName, String DOB, double tF) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = DOB;
        this.tuitionFees = tF;
    }
    
    Student() {}
    
    public String getFirstName() {
        return(firstName);
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }
    
    @Override
    public String toString() {
        return "First Name : "    + firstName + 
               " Last Name: "     + lastName + 
               " Date of Birth: " + dateOfBirth + 
               " Tuition Fees: "  + tuitionFees;
    }
}
