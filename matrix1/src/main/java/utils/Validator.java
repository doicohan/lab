package util;

import java.util.Scanner;

public class Validator {

    private final Scanner sc = new Scanner(System.in);

    public int getInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Value must be a number");
            }
        }
    }

    public int getPositiveInt(String msg) {
        while (true) {
            int n = getInt(msg);

            if (n > 0) {
                return n;
            }

            System.out.println("Value must be greater than 0");
        }
    }

    public int getIntLimit(String msg, int min, int max) {
        while (true) {

            int n = getInt(msg);

            if (n >= min && n <= max) {
                return n;
            }

            System.out.println("Please input number from " + min + " to " + max);
        }
    }
}