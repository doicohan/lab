package utils;

import java.util.Scanner;

public class Validator {

    private Scanner sc = new Scanner(System.in);

    public int getInt(String msg) {

        while (true) {

            try {

                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());

            } catch (Exception e) {

                System.out.println("Invalid number");

            }
        }
    }

    public int getPositiveInt(String msg) {

        while (true) {

            int n = getInt(msg);

            if (n > 0) {
                return n;
            }

            System.out.println("Must be > 0");
        }
    }

    public int getIntLimit(String msg, int min, int max) {

        while (true) {

            int n = getInt(msg);

            if (n >= min && n <= max) {
                return n;
            }

            System.out.println("Enter number from " + min + " to " + max);
        }
    }
}
