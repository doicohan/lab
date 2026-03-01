package worker;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Management management = new Management();

        while (true) {

            System.out.println("======== Worker Management =========");
            System.out.println("1. Add Worker");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            System.out.println("4. Display Information salary");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            try {
                switch (choice) {

                    case 1:
                        System.out.println("--------- Add Worker ----------");

                        System.out.print("Enter Code: ");
                        String id = sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Salary: ");
                        double salary = Double.parseDouble(sc.nextLine());

                        System.out.print("Enter work location: ");
                        String location = sc.nextLine();

                        Worker worker = new Worker(id, name, age, salary, location);
                        management.addWorker(worker);

                        System.out.println("Add successful!");
                        break;

                    case 2:
                        System.out.println("------- Up/Down Salary --------");

                        System.out.print("Enter Code: ");
                        String upId = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double upAmount = Double.parseDouble(sc.nextLine());

                        management.changeSalary(SalaryStatus.UP, upId, upAmount);
                        System.out.println("Update successful!");
                        break;

                    case 3:
                        System.out.println("------- Up/Down Salary --------");

                        System.out.print("Enter Code: ");
                        String downId = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double downAmount = Double.parseDouble(sc.nextLine());

                        management.changeSalary(SalaryStatus.DOWN, downId, downAmount);
                        System.out.println("Update successful!");
                        break;

                    case 4:
                        System.out.println("--------------------Display Information Salary-----------------------");
                        System.out.printf("%-10s %-15s %-5s %-10s %-10s %-15s\n",
                                "Code", "Name", "Age", "Salary", "Status", "Date");

                        List<SalaryHistory> list = management.getInfomationSalary();
                        for (SalaryHistory sh : list) {
                            System.out.println(sh);
                        }
                        break;

                    case 5:
                        return;
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println();
        }
    }
}