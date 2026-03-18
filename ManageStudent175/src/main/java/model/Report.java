package model;

public class Report {

    private String studentName;
    private String courseName;
    private int total;

    public Report(String studentName, String courseName, int total){
        this.studentName = studentName;
        this.courseName = courseName;
        this.total = total;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getTotal() {
        return total;
    }
}