package main;

import controller.Controller;
import utils.Menu;
import entity.Shape;

public class Main {

    public static void main(String[] args) {
        System.out.println("===Caculator Shape Program===");
        Controller controller = new Controller();

        while (true) {
            Shape shape = Menu.chooseShape();
            if (shape == null) {
                break;
            }
            controller.addShape(shape);
        }

        controller.display();
    }
}
