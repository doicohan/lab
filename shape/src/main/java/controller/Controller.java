package controller;

import entity.Shape;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Shape> list = new ArrayList<>();

    public void addShape(Shape s) {
        if (s != null) {
            list.add(s);
        }
    }

    public void showResult() {
        System.out.println("\n===== RESULT =====");
        for (Shape s : list) {
            s.printResult();
        }
    }
}
