package controller;

import entity.Shape;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Shape> list;

    public Controller() {
        this.list = new ArrayList<>();
    }
    
    public void addShape(Shape shape){
        if(shape != null){
            list.add(shape);
            System.out.println("Shape add successfully");
        }
    }
    
    public void display() {
        System.out.println("---display all shape---");
        if (list.isEmpty()) {
            System.out.println("no shape to display.");
        } else {
            for(Shape shape : list){
                shape.printResult();
            }
        }
    }
}
