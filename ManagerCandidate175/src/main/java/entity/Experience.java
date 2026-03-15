package entity;

public class Experience extends Candidate {

    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int expInYear, String proSkill,
            String candidateId, String firstName, String lastName,
            int birthDate, String address, String phone,
            String email, int candidateType) {

        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + expInYear + "|" + proSkill;
    }
}