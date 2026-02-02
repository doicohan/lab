package utils;

import entity.*;


public class Menu {

    public static Shape chooseShape() {
        System.out.println("---Add a new shape ---");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.println("4. Display");

        int choice = Validator.getInt(
            "input your choice: ",
            "number in 1 - 4",
            "number in 1 - 4",
            1, 4
        );
        
        switch (choice) {
            case 1:
                double width = Validator.getDouble(
                    "Please input side width of Rectangle: ",
                    "Please enter number >0",
                    "Invalid!",
                    Double.MIN_VALUE, Double.MAX_VALUE
                );
                double length = Validator.getDouble(
                    "Please input length of Rectangle: ",
                    "Please enter number >0",
                    "Invalid!",
                    Double.MIN_VALUE, Double.MAX_VALUE
                );
                return new Rectangle(width, length);

            case 2:
                double radius = Validator.getDouble(
                    "Please input radius of Circle: ",
                    "Please enter number >0",
                    "Invalid!",
                    Double.MIN_VALUE, Double.MAX_VALUE
                );
                return new Circle(radius);

            case 3:
                double a, b, c;
                while (true) {
                    a = Validator.getDouble("Please input side A of Triangle: ", "number >0", "Invalid!", Double.MIN_VALUE, Double.MAX_VALUE);
                    b = Validator.getDouble("Please input side B of Triangle: ", "number >0", "Invalid!", Double.MIN_VALUE, Double.MAX_VALUE);
                    c = Validator.getDouble("Please input side C of Triangle: ", "number >0", "Invalid!", Double.MIN_VALUE, Double.MAX_VALUE);

                    if (a + b > c && a + c > b && b + c > a) {
                        break;
                    }
                    System.out.println("Sum of two sides must be greater than the remaining side.");
                }
                return new Triangle(a, b, c);

            case 4:
                return null;
        }
        return null;
    }
}
