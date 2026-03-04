package utils;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Validator {

    private Scanner sc = new Scanner(System.in);

    public int getInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int number = Integer.parseInt(sc.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println("Please input number in range!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }
    }

    public double getDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                double number = Double.parseDouble(sc.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }
    }

    public String getString(String msg) {
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Cannot empty!");
        }
    }

    public String getDate(String msg) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);

        while (true) {
            try {
                System.out.print(msg);
                String date = sc.nextLine();
                sdf.parse(date);
                return date;
            } catch (Exception e) {
                System.out.println("Invalid date format!");
            }
        }
    }
}