package utils;

import java.util.Scanner;

public class Validator {

    private static final Scanner sc = new Scanner(System.in);

    public static int getInt(String msg, String err) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }

    public static int getInt(String msg, String err, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int value = Integer.parseInt(sc.nextLine());
                if (value < min || value > max) {
                    throw new Exception();
                }
                return value;
            } catch (Exception e) {
                System.out.println(err);
            }
        }
    }
}
