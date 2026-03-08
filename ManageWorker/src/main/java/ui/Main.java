package ui;

import controller.Management;
import model.*;
import utils.Validator;

import java.text.SimpleDateFormat;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Management manager = new Management();

        while (true) {

            System.out.println("\n======== Worker Management =========");
            System.out.println("1. Add Worker");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            System.out.println("4. Display Information salary");
            System.out.println("5. Exit");

            int choice = Validator.inputInt("Choose: ", 1, 5);

            try {

                switch (choice) {

                    case 1:

                        System.out.println("\n-------- Add Worker --------");

                        String id = Validator.inputString("Enter Code: ");
                        String name = Validator.inputName("Enter Name: ");
                        int age = Validator.inputAge("Enter Age: ");
                        double salary = Validator.inputSalary("Enter Salary: ");
                        String location = Validator.inputString("Enter work location: ");

                        Worker worker = new Worker(id, name, age, salary, location);

                        manager.addWorker(worker);

                        System.out.println("Add worker success.");

                        break;

                    case 2:

                        System.out.println("\n-------- Up/Down Salary --------");

                        id = Validator.inputString("Enter Code: ");
                        double up = Validator.inputSalary("Enter Salary: ");

                        manager.changeSalary(SalaryStatus.UP, id, up);

                        System.out.println("Update success.");

                        break;

                    case 3:

                        System.out.println("\n-------- Up/Down Salary --------");

                        id = Validator.inputString("Enter Code: ");
                        double down = Validator.inputSalary("Enter Salary: ");

                        manager.changeSalary(SalaryStatus.DOWN, id, down);

                        System.out.println("Update success.");

                        break;

                    case 4:

                        System.out.println("\n----------------Display Information Salary----------------");

                        List<SalaryHistory> list = manager.getInfomationSalary();

                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                        System.out.printf("%-6s%-10s%-6s%-10s%-10s%-15s\n",
                                "Code", "Name", "Age", "Salary", "Status", "Date");

                        for (SalaryHistory h : list) {

                            System.out.printf("%-6s%-10s%-6d%-10.0f%-10s%-15s\n",
                                    h.getId(),
                                    h.getName(),
                                    h.getAge(),
                                    h.getSalary(),
                                    h.getStatus(),
                                    sdf.format(h.getDate()));
                        }

                        break;

                    case 5:
                        return;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}