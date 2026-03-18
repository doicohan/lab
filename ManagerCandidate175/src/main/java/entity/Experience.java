package entity;

public class Experience extends Candidate {

    private int expYear;
    private String proSkill;

    public Experience(int expYear, String proSkill,
            String id, String firstName, String lastName,
            int birthYear, String address, String phone,
            String email, int type) {

        super(id, firstName, lastName, birthYear, address, phone, email, type);
        this.expYear = expYear;
        this.proSkill = proSkill;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" | %d | %s\n", expYear, proSkill);
    }
}