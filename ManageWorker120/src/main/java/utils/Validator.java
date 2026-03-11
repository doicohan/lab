package utils;

import java.util.Scanner;

public class Validator {

    private static final Scanner sc = new Scanner(System.in);

    public static String inputString(String msg) {
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Input cannot be empty.");
        }
    }

    public static String inputName(String msg) {
        while (true) {
            System.out.print(msg);
            String name = sc.nextLine().trim();

            if (name.matches("[a-zA-Z ]+")) {
                return name;
            }

            System.out.println("Name must contain letters only.");
        }
    }

    public static int inputAge(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                int age = Integer.parseInt(sc.nextLine());

                if (age >= 18 && age <= 50) {
                    return age;
                }

                System.out.println("Age must be between 18 and 50.");
            } catch (Exception e) {
                System.out.println("Invalid number.");
            }
        }
    }

    public static double inputSalary(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                double salary = Double.parseDouble(sc.nextLine());

                if (salary > 0) {
                    return salary;
                }

                System.out.println("Salary must be > 0.");
            } catch (Exception e) {
                System.out.println("Invalid number.");
            }
        }
    }

    public static int inputInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());

                if (n >= min && n <= max) {
                    return n;
                }

                System.out.println("Please input between " + min + " and " + max);
            } catch (Exception e) {
                System.out.println("Invalid number.");
            }
        }
    }
}