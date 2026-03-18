package manager;

import java.util.ArrayList;
import java.util.Collections;
import model.Student;
import model.Report;

public class StudentManager {

    public boolean checkDuplicate(ArrayList<Student> list, Student s){
        for(Student st : list){
            if(st.getId().equalsIgnoreCase(s.getId())
                    && st.getSemester().equalsIgnoreCase(s.getSemester())
                    && st.getCourseName().equalsIgnoreCase(s.getCourseName())){
                return true;
            }
        }
        return false;
    }

    public boolean addStudent(ArrayList<Student> list, Student s){
        if(checkDuplicate(list, s)){
            return false;
        }
        list.add(s);
        return true;
    }

    public ArrayList<Student> search(ArrayList<Student> list, String name){
        ArrayList<Student> result = new ArrayList<Student>();

        for(Student s : list){
            if(s.getStudentName().toLowerCase().contains(name.toLowerCase())){
                result.add(s);
            }
        }

        Collections.sort(result);
        return result;
    }

    public ArrayList<Report> getReport(ArrayList<Student> list){

        ArrayList<Report> rlist = new ArrayList<Report>();

        for(Student s : list){

            int count = 0;

            for(Student st : list){
                if(s.getStudentName().equalsIgnoreCase(st.getStudentName())
                        && s.getCourseName().equalsIgnoreCase(st.getCourseName())){
                    count++;
                }
            }

            boolean exist = false;

            for(Report r : rlist){
                if(r.getStudentName().equalsIgnoreCase(s.getStudentName())
                        && r.getCourseName().equalsIgnoreCase(s.getCourseName())){
                    exist = true;
                    break;
                }
            }

            if(!exist){
                rlist.add(new Report(
                        s.getStudentName(),
                        s.getCourseName(),
                        count));
            }
        }

        return rlist;
    }
}