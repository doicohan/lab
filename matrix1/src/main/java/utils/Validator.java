package utils;

import java.util.Scanner;

public class Validator {

    private final Scanner sc = new Scanner(System.in);

    public int getInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Values of matrix must be the number");
            }
        }
    }

    public int getPositiveInt(String message) {
        while (true) {
            int number = getInt(message);
            if (number > 0) {
                return number;
            }
            System.out.println("Row and column must be greater than 0");
        }
    }

    public int getIntLimit(String message, int min, int max) {
        while (true) {
            int number = getInt(message);
            if (number >= min && number <= max) {
                return number;
            }
            System.out.println("Please choose between " + min + " and " + max);
        }
    }
}