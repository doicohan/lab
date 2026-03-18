package utils;

import java.util.Scanner;

public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(int min, int max){
        while(true){
            try{
                int n = Integer.parseInt(sc.nextLine());
                if(n < min || n > max){
                    throw new NumberFormatException();
                }
                return n;
            }catch(Exception e){
                System.out.print("Input again: ");
            }
        }
    }

    public static String inputString(){
        while(true){
            String s = sc.nextLine().trim();
            if(s.isEmpty()){
                System.out.print("Input again: ");
            }else{
                return s;
            }
        }
    }

    public static String inputName(){
        while(true){
            String s = inputString();
            if(s.matches("[a-zA-Z ]+")){
                return s;
            }
            System.out.print("Name invalid, input again: ");
        }
    }

    public static String inputCourse(){
        while(true){
            String s = inputString();
            if(s.equalsIgnoreCase("Java") ||
               s.equalsIgnoreCase(".Net") ||
               s.equalsIgnoreCase("C/C++")){
                return s;
            }
            System.out.print("Course must be Java/.Net/C/C++: ");
        }
    }

    public static boolean inputYN(){
        while(true){
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("Y")) return true;
            if(s.equalsIgnoreCase("N")) return false;
            System.out.print("Input Y/N: ");
        }
    }
}