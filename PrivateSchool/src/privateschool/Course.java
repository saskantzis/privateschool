/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateschool;


public class Course {
    private String courseTitle;
    private String courseStream;
    private String courseType;
    private String courseStartDate;
    private String courseEndDate;
    
    Course(){}

    public Course(String courseTitle, String courseStream, String courseType, String courseStartDate, String courseEndDate) {
        this.courseTitle = courseTitle;
        this.courseStream = courseStream;
        this.courseType = courseType;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseStream() {
        return courseStream;
    }

    public String getCourseType() {
        return courseType;
    }

    public String getCourseStartDate() {
        return courseStartDate;
    }

    public String getCourseEndDate() {
        return courseEndDate;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCourseStream(String courseStream) {
        this.courseStream = courseStream;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public void setCourseStartDate(String courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public void setCourseEndDate(String courseEndDate) {
        this.courseEndDate = courseEndDate;
    }

          
}
