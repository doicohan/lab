package ui;

import java.util.ArrayList;
import manager.StudentManager;
import model.Student;
import utils.Validation;

public class Main {

    public static void main(String[] args){

        ArrayList<Student> list = new ArrayList<>();

        StudentManager manager = new StudentManager();

        while(true){

            manager.menu();

            int choice = Validation.checkInputIntLimit(1,5);

            switch(choice){

                case 1:
                    manager.createStudent(list);
                    break;

                case 2:
                    manager.findAndSort(list);
                    break;

                case 3:
                    System.out.println("Update/Delete implement here");
                    break;

                case 4:
                    manager.report(list);
                    break;

                case 5:
                    return;
            }
        }
    }
}