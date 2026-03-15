package utils;

import java.util.Scanner;

public class Validator {

    private static final Scanner in = new Scanner(System.in);

    private static final String BINARY_VALID = "[01]+";
    private static final String DECIMAL_VALID = "[0-9]+";
    private static final String HEXA_VALID = "[0-9A-Fa-f]+";

    public static int checkInputIntLimit(int min, int max) {

        while (true) {

            try {

                int result = Integer.parseInt(in.nextLine().trim());

                if (result < min || result > max) {
                    throw new NumberFormatException();
                }

                return result;

            } catch (NumberFormatException e) {

                System.out.print("Please enter number in range [" + min + "," + max + "]: ");
            }
        }
    }

    public static String checkInputBinary() {

        System.out.print("Enter binary: ");

        while (true) {

            String input = in.nextLine().trim();

            if (input.matches(BINARY_VALID)) {
                return input;
            }

            System.out.print("Enter again: ");
        }
    }

    public static String checkInputDecimal() {

        System.out.print("Enter decimal: ");

        while (true) {

            String input = in.nextLine().trim();

            if (input.matches(DECIMAL_VALID)) {
                return input;
            }

            System.out.print("Enter again: ");
        }
    }

    public static String checkInputHexaDecimal() {

        System.out.print("Enter hexadecimal: ");

        while (true) {

            String input = in.nextLine().trim();

            if (input.matches(HEXA_VALID)) {
                return input;
            }

            System.out.print("Enter again: ");
        }
    }
}