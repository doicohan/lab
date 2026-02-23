package controller;

import entity.*;
import utils.Validator;

public class Menu {

    public static Shape chooseShape() {

        System.out.println("\nAdd a new shape");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.println("4. Exit");

        int choice = Validator.getInt(
                "Input your choice: ",
                "Choice must be 1-4",
                "Must be a number",
                1, 4
        );

        switch (choice) {
            case 1:
                double w = Validator.getDouble(
                        "Width: ",
                        "Width must be > 0",
                        "Must be a number",
                        0.0001, Double.MAX_VALUE
                );

                double l = Validator.getDouble(
                        "Length: ",
                        "Length must be > 0",
                        "Must be a number",
                        0.0001, Double.MAX_VALUE
                );

                return new Rectangle(w, l);

            case 2:
                double r = Validator.getDouble(
                        "Radius: ",
                        "Radius must be > 0",
                        "Must be a number",
                        0.0001, Double.MAX_VALUE
                );

                return new Circle(r);

            case 3:
                double a = Validator.getDouble(
                        "Side A: ",
                        "Side must be > 0",
                        "Must be a number",
                        0.0001, Double.MAX_VALUE
                );

                double b = Validator.getDouble(
                        "Side B: ",
                        "Side must be > 0",
                        "Must be a number",
                        0.0001, Double.MAX_VALUE
                );

                double c = Validator.getDouble(
                        "Side C: ",
                        "Side must be > 0",
                        "Must be a number",
                        0.0001, Double.MAX_VALUE
                );

                return new Triangle(a, b, c);

            case 4:
                return null;
        }

        return null;
    }
}
