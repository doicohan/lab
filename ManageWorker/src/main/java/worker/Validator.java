package worker;

public class Validator {

    public static void validateId(String id) throws Exception {
        if (id == null || id.trim().isEmpty()) {
            throw new Exception("Code cannot be null");
        }
    }

    public static void validateAge(int age) throws Exception {
        if (age < 18 || age > 50) {
            throw new Exception("Age must be in range 18 to 50");
        }
    }

    public static void validateSalary(double salary) throws Exception {
        if (salary <= 0) {
            throw new Exception("Salary must be greater than 0");
        }
    }

    public static void validateAmount(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Amount must be > 0");
        }
    }
}