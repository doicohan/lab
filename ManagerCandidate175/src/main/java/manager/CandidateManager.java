package manager;

import entity.Candidate;
import java.util.ArrayList;

public class CandidateManager {

    private ArrayList<Candidate> list = new ArrayList<>();

    public boolean isExistId(String id) {
        for (Candidate c : list) {
            if (c.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public void addCandidate(Candidate c) {
        list.add(c);
    }

    public void displayAll() {
        for (Candidate c : list) {
            c.display();
        }
    }

    public void search(String name, int type) {

        for (Candidate c : list) {

            if (c.getType() == type &&
                    (c.getFirstName().contains(name)
                    || c.getLastName().contains(name))) {

                c.display();
            }
        }
    }
}