package utils;

import java.util.Scanner;

public class Validator {

    private static final Scanner SC = new Scanner(System.in);

    private Validator() {
    }

    public static int getInt(String message, String errorMsg) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(SC.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static int getIntInRange(String message, int min, int max) {
        while (true) {
            try {
                System.out.print(message);
                int value = Integer.parseInt(SC.nextLine());
                if (value >= min && value <= max) {
                    return value;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println("Invalid input");
        }
    }
}
