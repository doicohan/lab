package utils;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class Validation {

    private static final Scanner in = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + "," + max + "]");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (!result.isEmpty()) {
                return result;
            }
            System.err.println("Input cannot be empty");
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input Y/N");
        }
    }

    public static boolean checkInputUD() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input U/D");
        }
    }

    public static String checkInputCourse() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Java")
                    || result.equalsIgnoreCase(".Net")
                    || result.equalsIgnoreCase("C/C++")) {
                return result;
            }
            System.err.println("Only Java, .Net, C/C++");
        }
    }

    public static boolean checkStudentExist(ArrayList<Student> ls,
            String id, String name, String semester, String course) {

        for (Student s : ls) {
            if (id.equalsIgnoreCase(s.getId())
                    && name.equalsIgnoreCase(s.getStudentName())
                    && semester.equalsIgnoreCase(s.getSemester())
                    && course.equalsIgnoreCase(s.getCourseName())) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkReportExist(ArrayList<Report> lr,
            String name, String course, int total) {

        for (Report r : lr) {
            if (name.equalsIgnoreCase(r.getStudentName())
                    && course.equalsIgnoreCase(r.getCourseName())
                    && total == r.getTotalCourse()) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIdExist(ArrayList<Student> ls, String id, String name) {

        for (Student s : ls) {
            if (id.equalsIgnoreCase(s.getId())
                    && !name.equalsIgnoreCase(s.getStudentName())) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkChangeInfomation(Student student,
            String id, String name, String semester, String course) {

        return !(id.equalsIgnoreCase(student.getId())
                && name.equalsIgnoreCase(student.getStudentName())
                && semester.equalsIgnoreCase(student.getSemester())
                && course.equalsIgnoreCase(student.getCourseName()));
    }
}
