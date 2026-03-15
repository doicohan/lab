package entity;

public class Fresher extends Candidate {

    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String education,
            String candidateId, String firstName, String lastName,
            int birthDate, String address, String phone,
            String email, int candidateType) {

        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);

        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + graduationDate + "|" + graduationRank + "|" + education;
    }
}