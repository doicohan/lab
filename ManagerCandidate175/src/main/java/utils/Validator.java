package util;

import java.util.Scanner;

public class Validator {

    private static final Scanner in = new Scanner(System.in);

    public static String inputString(String msg) {
        System.out.print(msg);
        return in.nextLine().trim();
    }

    public static int inputInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }
    }

    public static String inputPhone(String msg) {
        while (true) {
            String phone = inputString(msg);
            if (phone.matches("\\d{10}")) {
                return phone;
            }
            System.out.println("Phone must be 10 digits.");
        }
    }

    public static String inputEmail(String msg) {
        while (true) {
            String email = inputString(msg);
            if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                return email;
            }
            System.out.println("Invalid email.");
        }
    }
}