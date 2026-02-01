package controller;

import entity.*;
import utils.Menu;
import utils.Validator;

public class Controller {

    public void run() {

        Menu.showHeader();

        Menu.showInputRectangleWidth();
        double width = Validator.getPositiveDouble();

        Menu.showInputRectangleLength();
        double length = Validator.getPositiveDouble();

        Menu.showInputCircleRadius();
        double radius = Validator.getPositiveDouble();

        Menu.showInputTriangleA();
        double a = Validator.getPositiveDouble();

        Menu.showInputTriangleB();
        double b = Validator.getPositiveDouble();

        Menu.showInputTriangleC();
        double c = Validator.getPositiveDouble();

        Shape rectangle = new Rectangle(width, length);
        Shape circle = new Circle(radius);
        Shape triangle = new Triangle(a, b, c);

        Menu.showRectangleTitle();
        rectangle.printResult();

        Menu.showCircleTitle();
        circle.printResult();

        Menu.showTriangleTitle();
        triangle.printResult();
    }
}
