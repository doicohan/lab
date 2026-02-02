package utils;

import java.util.Scanner;

public class Validator {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Validator(){}

    public static int getInt(String messageInfo, String messageErrorOutOfRange,
                             String messageErroNumber, int min , int max){
        while(true){
            try{
                System.out.print(messageInfo);
                int number = Integer.parseInt(SCANNER.nextLine());
                if(number >= min && number <= max){
                    return number;
                }
                System.out.println(messageErrorOutOfRange);
            } catch(NumberFormatException e){
                System.out.println(messageErroNumber);
            }
        }
    }

    public static double getDouble(String messageInfo, String messageErrorOutOfRange,
                                   String messageErroNumber, double min , double max){
        while(true){
            try{
                System.out.print(messageInfo);
                double number = Double.parseDouble(SCANNER.nextLine());
                if(number >= min && number <= max){
                    return number;
                }
                System.out.println(messageErrorOutOfRange);
            } catch(NumberFormatException e){
                System.out.println(messageErroNumber);
            }
        }
    }
}
