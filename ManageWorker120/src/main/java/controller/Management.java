package controller;

import model.*;
import java.util.*;

public class Management {

    private List<Worker> workers = new ArrayList<>();
    private List<SalaryHistory> histories = new ArrayList<>();

    public boolean addWorker(Worker worker) throws Exception {

        if (findWorker(worker.getId()) != null) {
            throw new Exception("Worker id duplicated.");
        }

        workers.add(worker);
        return true;
    }

    public boolean changeSalary(SalaryStatus status, String code, double amount) throws Exception {

        Worker worker = findWorker(code);

        if (worker == null) {
            throw new Exception("Worker not found.");
        }

        if (amount <= 0) {
            throw new Exception("Amount must be > 0.");
        }

        double newSalary = worker.getSalary();

        if (status == SalaryStatus.UP) {
            newSalary += amount;
        } else {
            if (worker.getSalary() < amount) {
                throw new Exception("Salary cannot be negative.");
            }
            newSalary -= amount;
        }

        worker.setSalary(newSalary);

        histories.add(new SalaryHistory(
                worker.getId(),
                worker.getName(),
                worker.getAge(),
                newSalary,
                status,
                new Date()
        ));

        return true;
    }

    public List<SalaryHistory> getInfomationSalary() {

        histories.sort(Comparator.comparing(SalaryHistory::getId));

        return histories;
    }

    private Worker findWorker(String id) {

        for (Worker w : workers) {
            if (w.getId().equalsIgnoreCase(id)) {
                return w;
            }
        }

        return null;
    }
}