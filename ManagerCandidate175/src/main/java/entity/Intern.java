package entity;

public class Intern extends Candidate {

    private String major;
    private String semester;
    private String university;

    public Intern(String major, String semester, String university,
            String id, String firstName, String lastName,
            int birthYear, String address, String phone,
            String email, int type) {

        super(id, firstName, lastName, birthYear, address, phone, email, type);

        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public String getSemester() {
        return semester;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" | %s | %s | %s\n",
                major, semester, university);
    }
}