package utils;

import java.util.Scanner;

public class Validator {

    private final Scanner sc = new Scanner(System.in);

    public int getInt(String msg, int min, int max) {

        while (true) {
            try {

                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());

                if (n < min || n > max) {
                    System.out.println("Out of range");
                } else {
                    return n;
                }

            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }
    }

    public String getString(String msg) {

        while (true) {

            System.out.print(msg);
            String s = sc.nextLine().trim();

            if (s.isEmpty()) {
                System.out.println("Empty!");
            } else {
                return s;
            }
        }
    }

    public String getDate(String msg) {

        String regex = "\\d{2}-\\d{2}-\\d{4}";

        while (true) {

            System.out.print(msg);
            String date = sc.nextLine();

            if (date.matches(regex)) {
                return date;
            }

            System.out.println("Invalid date format (dd-MM-yyyy)");
        }
    }

    public double getTime(String msg) {

        while (true) {

            try {

                System.out.print(msg);
                double t = Double.parseDouble(sc.nextLine());

                if (t < 8.0 || t > 17.5 || t % 0.5 != 0) {
                    System.out.println("Time must be 8.0 -> 17.5 step 0.5");
                } else {
                    return t;
                }

            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }
    }

}