package entity;

public class Intern extends Candidate {

    private String major;
    private String semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String major, String semester, String universityName,
            String candidateId, String firstName, String lastName,
            int birthDate, String address, String phone,
            String email, int candidateType) {

        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);

        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + major + "|" + semester + "|" + universityName;
    }
}