package ui;

import java.util.ArrayList;
import manager.StudentManager;
import model.Student;
import model.Report;
import utils.Validation;

public class Main {

    public static void main(String[] args){

        ArrayList<Student> list = new ArrayList<Student>();
        StudentManager manager = new StudentManager();

        while(true){

            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Report");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            int choice = Validation.inputInt(1,4);

            switch(choice){

                case 1:

                    if(list.size() >= 10){
                        System.out.print("Continue (Y/N): ");
                        if(!Validation.inputYN()) break;
                    }

                    System.out.print("ID: ");
                    String id = Validation.inputString();

                    System.out.print("Name: ");
                    String name = Validation.inputName();

                    System.out.print("Semester: ");
                    String semester = Validation.inputString();

                    System.out.print("Course: ");
                    String course = Validation.inputCourse();

                    Student s = new Student(id, name, semester, course);

                    if(!manager.addStudent(list, s)){
                        System.out.println("Duplicate!");
                    }

                    break;

                case 2:

                    System.out.print("Search name: ");
                    String search = Validation.inputString();

                    ArrayList<Student> result = manager.search(list, search);

                    for(Student st : result){
                        System.out.printf("%-20s%-10s%-10s\n",
                                st.getStudentName(),
                                st.getSemester(),
                                st.getCourseName());
                    }

                    break;

                case 3:

                    ArrayList<Report> rlist = manager.getReport(list);

                    for(Report r : rlist){
                        System.out.printf("%-20s | %-10s | %d\n",
                                r.getStudentName(),
                                r.getCourseName(),
                                r.getTotal());
                    }

                    break;

                case 4:
                    return;
            }
        }
    }
}