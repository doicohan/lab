package model;

import java.util.Date;

public class SalaryHistory {

    private String id;
    private String name;
    private int age;
    private double salary;
    private SalaryStatus status;
    private Date date;

    public SalaryHistory(String id, String name, int age,
                         double salary, SalaryStatus status, Date date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public SalaryStatus getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }
}