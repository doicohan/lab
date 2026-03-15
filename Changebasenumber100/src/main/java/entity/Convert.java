package entity;

public class Convert {

    private final char[] hexDigits = {
        '0','1','2','3','4','5','6','7',
        '8','9','A','B','C','D','E','F'
    };

    public String binaryToDecimal(String binary) {

        int decimal = Integer.parseInt(binary, 2);

        return Integer.toString(decimal);
    }

    public String binaryToHexa(String binary) {

        String decimal = binaryToDecimal(binary);

        return decimalToHexa(decimal);
    }

    public int hexaToDecimal(String hexa) {

        return Integer.parseInt(hexa, 16);
    }

    public String hexaToBinary(String hexa) {

        return Integer.toBinaryString(hexaToDecimal(hexa));
    }

    public String decimalToBinary(String decimal) {

        return Integer.toBinaryString(Integer.parseInt(decimal));
    }

    public String decimalToHexa(String decimal) {

        int dec = Integer.parseInt(decimal);

        if (dec == 0) {
            return "0";
        }

        String hexa = "";

        while (dec != 0) {

            hexa = hexDigits[dec % 16] + hexa;

            dec /= 16;
        }

        return hexa;
    }
}