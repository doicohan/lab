package util;

import java.util.Scanner;

public class Validator {

    private static final Scanner in = new Scanner(System.in);

    private static final String PHONE_REGEX = "\\d{10}";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";

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

    public static String inputPhone() {
        while (true) {
            String phone = inputString("Phone: ");
            if (phone.matches(PHONE_REGEX)) {
                return phone;
            }
            System.out.println("Invalid phone!");
        }
    }

    public static String inputEmail() {
        while (true) {
            String email = inputString("Email: ");
            if (email.matches(EMAIL_REGEX)) {
                return email;
            }
            System.out.println("Invalid email!");
        }
    }
}