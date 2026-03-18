package entity;

public class Fresher extends Candidate {

    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher(String graduationDate, String graduationRank, String education,
            String id, String firstName, String lastName,
            int birthYear, String address, String phone,
            String email, int type) {

        super(id, firstName, lastName, birthYear, address, phone, email, type);

        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public String getEducation() {
        return education;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" | %s | %s | %s\n",
                graduationDate, graduationRank, education);
    }
}