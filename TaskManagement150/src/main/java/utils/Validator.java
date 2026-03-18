package utils;

import java.util.Scanner;

public class Validator {

    private Scanner sc = new Scanner(System.in);

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

    public int getInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    throw new Exception();
                }
                return n;
            } catch (Exception e) {
                System.out.println("Invalid!");
            }
        }
    }

    public double getTime(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                double t = Double.parseDouble(sc.nextLine());
                if (t < 8 || t > 17.5 || t % 0.5 != 0) {
                    throw new Exception();
                }
                return t;
            } catch (Exception e) {
                System.out.println("Invalid time (8 -> 17.5, step 0.5)");
            }
        }
    }

    public String getDate(String msg) {
        while (true) {
            System.out.print(msg);
            String d = sc.nextLine();
            if (d.matches("\\d{1,2}-\\d{1,2}-\\d{4}")) {
                return d;
            }
            System.out.println("Invalid date format (dd-MM-yyyy)");
        }
    }
}