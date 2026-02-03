package utils;

import entity.*;

public class Menu {

    public static Shape chooseShape() {
        System.out.println("Add a new shape");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.println("4. Finish input");

        int choice = Validator.getInt(
                "Input your choice: ",
                "Choice must be 1-4",
                "Invalid number",
                1, 4
        );

        switch (choice) {
            case 1:
                double w = Validator.getDouble(
                        "Please input width of Rectangle: ",
                        "Out of range",
                        "Invalid number",
                        0.0001, Double.MAX_VALUE
                );
                double l = Validator.getDouble(
                        "Please input length of Rectangle: ",
                        "Out of range",
                        "Invalid number",
                        0.0001, Double.MAX_VALUE
                );
                return new Rectangle(w, l);

            case 2:
                double r = Validator.getDouble(
                        "Please input radius of Circle: ",
                        "Out of range",
                        "Invalid number",
                        0.0001, Double.MAX_VALUE
                );
                return new Circle(r);

            case 3:
                double a = Validator.getDouble("Side A: ", "Out", "Invalid", 0.0001, Double.MAX_VALUE);
                double b = Validator.getDouble("Side B: ", "Out", "Invalid", 0.0001, Double.MAX_VALUE);
                double c = Validator.getDouble("Side C: ", "Out", "Invalid", 0.0001, Double.MAX_VALUE);
                return new Triangle(a, b, c);

            case 4:
                return null; // kết thúc nhập
        }
        return null;
    }
}
