package manager;

import entity.*;
import util.Validator;
import java.util.ArrayList;

public class CandidateManager {

    private ArrayList<Candidate> list = new ArrayList<>();

    public void createCandidate(int type) {

        String id = Validator.inputString("Id: ");
        String first = Validator.inputString("First Name: ");
        String last = Validator.inputString("Last Name: ");
        int birth = Validator.inputInt("Birth Year: ");
        String address = Validator.inputString("Address: ");
        String phone = Validator.inputPhone();
        String email = Validator.inputEmail();

        if (type == 0) {

            int exp = Validator.inputInt("Experience Year: ");
            String skill = Validator.inputString("Pro Skill: ");

            list.add(new Experience(exp, skill, id, first, last, birth, address, phone, email, type));

        } else if (type == 1) {

            String date = Validator.inputString("Graduation Date: ");
            String rank = Validator.inputString("Graduation Rank: ");
            String edu = Validator.inputString("Education: ");

            list.add(new Fresher(date, rank, edu, id, first, last, birth, address, phone, email, type));

        } else {

            String major = Validator.inputString("Major: ");
            String sem = Validator.inputString("Semester: ");
            String uni = Validator.inputString("University: ");

            list.add(new Intern(major, sem, uni, id, first, last, birth, address, phone, email, type));
        }

    }

    public void search() {

        String name = Validator.inputString("Input name: ");
        int type = Validator.inputInt("Candidate Type: ");

        for (Candidate c : list) {

            if (c.getCandidateType() == type &&
                    (c.getFirstName().contains(name)
                    || c.getLastName().contains(name))) {

                System.out.println(c);
            }
        }
    }
}