/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;

public class Assignment {
    
    private String assignmentTitle;
    private String assignmentDescription;
    private String assignmentDate;
    private double oralMark;
    private double totalMark;
    
    Assignment(){}
    
    Assignment(String assignmentTitle, String assignmentDescription, String assignmentDate, double oralMark, double totalMark){
        this.assignmentTitle = assignmentTitle;
        this.assignmentDescription = assignmentDescription;
        this.assignmentDate = assignmentDate;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }   

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public String getAssigmentDate() {
        return assignmentDate;
    }

    public double getOralMark() {
        return oralMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription;
    }

    public void setAssigmentDate(String assigmentDate) {
        this.assignmentDate = assigmentDate;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }
    @Override
    public String toString() {
        return " Title: "    + assignmentTitle + 
               " Description: "     + assignmentDescription + 
               " Date: " + assignmentDate + 
               " Oral Mark: "  + oralMark +
               " Total Mark: " + totalMark;
    }
    
}
