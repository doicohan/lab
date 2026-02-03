package controller;

import entity.Shape;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Shape> list;

    public Controller() {
        list = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        if (shape != null) {
            list.add(shape);
        }
    }

    public void display() {
        if (list.isEmpty()) {
            System.out.println("No shape to display.");
            return;
        }
        for (Shape shape : list) {
            shape.printResult();
        }
    }
}
