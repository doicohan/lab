package ui;

import manager.CandidateManager;
import util.Validator;

public class Main {

    public static void main(String[] args) {

        CandidateManager manager = new CandidateManager();

        while (true) {

            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Intern");
            System.out.println("4. Search");
            System.out.println("5. Exit");

            int choice = Validator.inputInt("Choice: ");

            switch (choice) {

                case 1:
                    manager.createCandidate(0);
                    break;

                case 2:
                    manager.createCandidate(1);
                    break;

                case 3:
                    manager.createCandidate(2);
                    break;

                case 4:
                    manager.search();
                    break;

                case 5:
                    return;
            }
        }
    }
}