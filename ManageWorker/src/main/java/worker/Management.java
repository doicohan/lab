package worker;

import java.util.*;

public class Management {

    private List<Worker> workerList = new ArrayList<>();
    private List<SalaryHistory> historyList = new ArrayList<>();

    public boolean addWorker(Worker worker) throws Exception {

        // Validate basic data
        Validator.validateId(worker.getId());
        Validator.validateAge(worker.getAge());
        Validator.validateSalary(worker.getSalary());

        // Check duplicate ID
        for (Worker w : workerList) {
            if (w.getId().equalsIgnoreCase(worker.getId())) {
                throw new Exception("Code duplicated in DB");
            }
        }

        workerList.add(worker);
        return true;
    }

    public boolean changeSalary(SalaryStatus status, String code, double amount) throws Exception {

        Validator.validateId(code);
        Validator.validateAmount(amount);

        Worker worker = null;

        for (Worker w : workerList) {
            if (w.getId().equalsIgnoreCase(code)) {
                worker = w;
                break;
            }
        }

        if (worker == null) {
            throw new Exception("Code must be existed in DB");
        }

        if (status == SalaryStatus.UP) {
            worker.setSalary(worker.getSalary() + amount);
        } else {
            worker.setSalary(worker.getSalary() - amount);
        }

        historyList.add(new SalaryHistory(worker, status));
        return true;
    }

    public List<SalaryHistory> getInfomationSalary() {
        historyList.sort(Comparator.comparing(SalaryHistory::getId));
        return historyList;
    }
}