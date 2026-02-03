package main;

import controller.Controller;
import entity.Shape;
import utils.Menu;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        while (true) {
            Shape shape = Menu.chooseShape();
            if (shape == null) {
                break; // dừng nhập
            }
            controller.addShape(shape);
        }

        controller.display(); // in toàn bộ kết quả
    }
}
