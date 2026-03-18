package ui;

import entity.*;
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

                case 1: {
                    String id;
                    do {
                        id = Validator.inputString("Id: ");
                        if (manager.isExistId(id)) {
                            System.out.println("ID existed!");
                        }
                    } while (manager.isExistId(id));

                    String first = Validator.inputString("First Name: ");
                    String last = Validator.inputString("Last Name: ");
                    int birth = Validator.inputInt("Birth Year: ");
                    String address = Validator.inputString("Address: ");
                    String phone = Validator.inputPhone("Phone: ");
                    String email = Validator.inputEmail("Email: ");

                    int exp = Validator.inputInt("Experience Year: ");
                    String skill = Validator.inputString("Pro Skill: ");

                    manager.addCandidate(new Experience(exp, skill, id, first, last,
                            birth, address, phone, email, 0));
                    break;
                }

                case 2: {
                    String id;
                    do {
                        id = Validator.inputString("Id: ");
                        if (manager.isExistId(id)) {
                            System.out.println("ID existed!");
                        }
                    } while (manager.isExistId(id));

                    String first = Validator.inputString("First Name: ");
                    String last = Validator.inputString("Last Name: ");
                    int birth = Validator.inputInt("Birth Year: ");
                    String address = Validator.inputString("Address: ");
                    String phone = Validator.inputPhone("Phone: ");
                    String email = Validator.inputEmail("Email: ");

                    String date = Validator.inputString("Graduation Date: ");
                    String rank = Validator.inputString("Graduation Rank: ");
                    String edu = Validator.inputString("Education: ");

                    manager.addCandidate(new Fresher(date, rank, edu, id, first, last,
                            birth, address, phone, email, 1));
                    break;
                }

                case 3: {
                    String id;
                    do {
                        id = Validator.inputString("Id: ");
                        if (manager.isExistId(id)) {
                            System.out.println("ID existed!");
                        }
                    } while (manager.isExistId(id));

                    String first = Validator.inputString("First Name: ");
                    String last = Validator.inputString("Last Name: ");
                    int birth = Validator.inputInt("Birth Year: ");
                    String address = Validator.inputString("Address: ");
                    String phone = Validator.inputPhone("Phone: ");
                    String email = Validator.inputEmail("Email: ");

                    String major = Validator.inputString("Major: ");
                    String sem = Validator.inputString("Semester: ");
                    String uni = Validator.inputString("University: ");

                    manager.addCandidate(new Intern(major, sem, uni, id, first, last,
                            birth, address, phone, email, 2));
                    break;
                }

                case 4:
                    String name = Validator.inputString("Search Name: ");
                    int type = Validator.inputInt("Type (0-2): ");
                    manager.search(name, type);
                    break;

                case 5:
                    return;
            }
        }
    }
}