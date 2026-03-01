package worker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SalaryHistory {

    private String id;
    private String name;
    private int age;
    private double salary;
    private SalaryStatus status;
    private String date;

    public SalaryHistory(Worker worker, SalaryStatus status) {
        this.id = worker.getId();
        this.name = worker.getName();
        this.age = worker.getAge();
        this.salary = worker.getSalary();
        this.status = status;
        this.date = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-5d %-10.0f %-10s %-15s",
                id, name, age, salary, status, date);
    }
}