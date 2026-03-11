package manager;
import java.util.ArrayList;
import java.util.Collections;
import model.*;
import utils.Validation;

public class StudentManager {

    public void menu(){
        System.out.println("1. Create");
        System.out.println("2. Find and Sort");
        System.out.println("3. Update/Delete");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }

    public void createStudent(int count,ArrayList<Student> ls){

        if(count>10){
            System.out.print("Continue (Y/N): ");
            if(!Validation.checkInputYN()) return;
        }

        while(true){

            System.out.print("Enter ID: ");
            String id = Validation.checkInputString();

            System.out.print("Enter name: ");
            String name = Validation.checkInputString();

            if(!Validation.checkIdExist(ls,id,name)){
                System.out.println("ID existed!");
                continue;
            }

            System.out.print("Enter semester: ");
            String semester = Validation.checkInputString();

            System.out.print("Enter course: ");
            String course = Validation.checkInputCourse();

            if(Validation.checkStudentExist(ls,id,name,semester,course)){
                ls.add(new Student(id,name,semester,course));
                System.out.println("Add success!");
                return;
            }

            System.out.println("Duplicate!");
        }
    }

    public void findAndSort(ArrayList<Student> ls){

        if(ls.isEmpty()){
            System.out.println("List empty");
            return;
        }

        System.out.print("Enter name search: ");
        String name = Validation.checkInputString();

        ArrayList<Student> list = new ArrayList<>();

        for(Student s: ls){
            if(s.getStudentName().contains(name)){
                list.add(s);
            }
        }

        Collections.sort(list);

        System.out.printf("%-15s%-15s%-15s\n","Name","Semester","Course");

        for(Student s: list){
            s.print();
        }
    }

    public void report(ArrayList<Student> ls){

        ArrayList<Report> lr = new ArrayList<>();

        for(Student s : ls){

            int total = 0;

            for(Student st : ls){
                if(s.getId().equalsIgnoreCase(st.getId())
                        && s.getCourseName().equalsIgnoreCase(st.getCourseName())){
                    total++;
                }
            }

            if(Validation.checkReportExist(lr,
                    s.getStudentName(),s.getCourseName(),total)){

                lr.add(new Report(s.getStudentName(),
                        s.getCourseName(),total));
            }
        }

        for(Report r : lr){
            System.out.printf("%-15s|%-10s|%-5d\n",
                    r.getStudentName(),
                    r.getCourseName(),
                    r.getTotalCourse());
        }
    }
}