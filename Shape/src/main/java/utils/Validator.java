package utils;

import java.util.Scanner;

public class Validator {

    private static final Scanner sc = new Scanner(System.in);

    public static double getPositiveDouble() {
        while (true) {
            try {
                double value = Double.parseDouble(sc.nextLine());
                if (value > 0) {
                    return value;
                }
                System.out.println("Value must be greater than 0!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }
    }
}
