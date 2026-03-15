package utils;

import java.util.ArrayList;
import java.util.Scanner;
import model.Student;

public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max){
        while(true){
            try{
                int result = Integer.parseInt(sc.nextLine().trim());
                if(result < min || result > max){
                    throw new NumberFormatException();
                }
                return result;
            }catch(NumberFormatException e){
                System.out.print("Please input number in range: ");
            }
        }
    }

    public static String checkInputString(){
        while(true){
            String result = sc.nextLine().trim();
            if(result.isEmpty()){
                System.out.print("Input cannot be empty: ");
            }else{
                return result;
            }
        }
    }

    public static boolean checkInputYN(){
        while(true){
            String result = sc.nextLine().trim();
            if(result.equalsIgnoreCase("Y")){
                return true;
            }
            if(result.equalsIgnoreCase("N")){
                return false;
            }
            System.out.print("Please input Y/N: ");
        }
    }

    public static String checkInputCourse(){
        while(true){
            String result = checkInputString();
            if(result.equalsIgnoreCase("Java")
                    || result.equalsIgnoreCase(".Net")
                    || result.equalsIgnoreCase("C/C++")){
                return result;
            }
            System.out.print("Course must be Java, .Net or C/C++: ");
        }
    }

    public static boolean checkStudentExist(ArrayList<Student> list,
            String id, String name, String semester, String course){

        for(Student s : list){
            if(id.equalsIgnoreCase(s.getId())
                    && name.equalsIgnoreCase(s.getStudentName())
                    && semester.equalsIgnoreCase(s.getSemester())
                    && course.equalsIgnoreCase(s.getCourseName())){
                return false;
            }
        }
        return true;
    }
}