package main;

import controller.Controller;
import entity.Shape;
import controller.Menu;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        while (true) {
            Shape shape = Menu.chooseShape();
            if (shape == null) break;
            controller.addShape(shape);
        }

        controller.showResult();
    }
}
