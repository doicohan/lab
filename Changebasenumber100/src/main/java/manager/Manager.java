package manager;
import entity.Convert;
import utils.Validator;
public class Manager {

    private Convert convert = new Convert();

    public int menu() {

        System.out.println("1. Convert From Binary");
        System.out.println("2. Convert From Decimal");
        System.out.println("3. Convert From Hexadecimal");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");

        return Validator.checkInputIntLimit(1, 4);
    }

    public int displayConvert(String from, String to1, String to2) {

        System.out.println("1. Convert from " + from + " to " + to1);
        System.out.println("2. Convert from " + from + " to " + to2);

        System.out.print("Enter your choice: ");

        return Validator.checkInputIntLimit(1, 2);
    }

    public void convertFromBinary() {

        String binary = Validator.checkInputBinary();

        int choice = displayConvert("Binary", "Decimal", "Hexadecimal");

        switch (choice) {

            case 1:
                System.out.println("Decimal: " +
                        convert.binaryToDecimal(binary));
                break;

            case 2:
                System.out.println("Hexadecimal: " +
                        convert.binaryToHexa(binary));
                break;
        }
    }

    public void convertFromDecimal() {

        String decimal = Validator.checkInputDecimal();

        int choice = displayConvert("Decimal", "Binary", "Hexadecimal");

        switch (choice) {

            case 1:
                System.out.println("Binary: " +
                        convert.decimalToBinary(decimal));
                break;

            case 2:
                System.out.println("Hexadecimal: " +
                        convert.decimalToHexa(decimal));
                break;
        }
    }

    public void convertFromHexa() {

        String hexa = Validator.checkInputHexaDecimal();

        int choice = displayConvert("Hexadecimal", "Binary", "Decimal");

        switch (choice) {

            case 1:
                System.out.println("Binary: " +
                        convert.hexaToBinary(hexa));
                break;

            case 2:
                System.out.println("Decimal: " +
                        convert.hexaToDecimal(hexa));
                break;
        }
    }
}