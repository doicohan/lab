package manager;

import java.util.ArrayList;
import java.util.Collections;
import model.Report;
import model.Student;
import utils.Validation;

public class StudentManager {

    public void menu(){
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        System.out.println("1. Create");
        System.out.println("2. Find and Sort");
        System.out.println("3. Update/Delete");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }

    public void createStudent(ArrayList<Student> list){

        if(list.size() >= 10){
            System.out.print("Do you want to continue (Y/N): ");
            if(!Validation.checkInputYN()){
                return;
            }
        }

        System.out.print("Enter ID: ");
        String id = Validation.checkInputString();

        System.out.print("Enter Name: ");
        String name = Validation.checkInputString();

        System.out.print("Enter Semester: ");
        String semester = Validation.checkInputString();

        System.out.print("Enter Course: ");
        String course = Validation.checkInputCourse();

        if(Validation.checkStudentExist(list, id, name, semester, course)){
            list.add(new Student(id, name, semester, course));
            System.out.println("Add success.");
        }else{
            System.out.println("Duplicate student.");
        }
    }

    public void findAndSort(ArrayList<Student> list){

        if(list.isEmpty()){
            System.out.println("List empty.");
            return;
        }

        System.out.print("Enter name to search: ");
        String name = Validation.checkInputString();

        ArrayList<Student> result = new ArrayList<>();

        for(Student s : list){
            if(s.getStudentName().toLowerCase().contains(name.toLowerCase())){
                result.add(s);
            }
        }

        Collections.sort(result);

        System.out.printf("%-20s%-15s%-10s\n","Name","Semester","Course");

        for(Student s : result){
            s.print();
        }
    }

    public void report(ArrayList<Student> list){

        ArrayList<Report> reportList = new ArrayList<>();

        for(Student s : list){

            int count = 0;

            for(Student st : list){
                if(s.getStudentName().equalsIgnoreCase(st.getStudentName())
                        && s.getCourseName().equalsIgnoreCase(st.getCourseName())){
                    count++;
                }
            }

            boolean exist = false;

            for(Report r : reportList){
                if(r.getStudentName().equalsIgnoreCase(s.getStudentName())
                        && r.getCourseName().equalsIgnoreCase(s.getCourseName())){
                    exist = true;
                    break;
                }
            }

            if(!exist){
                reportList.add(new Report(s.getStudentName(),
                        s.getCourseName(), count));
            }
        }

        for(Report r : reportList){
            System.out.printf("%-20s | %-10s | %d\n",
                    r.getStudentName(),
                    r.getCourseName(),
                    r.getTotalCourse());
        }
    }
}