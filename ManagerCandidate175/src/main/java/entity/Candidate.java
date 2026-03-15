package entity;

public class Candidate {

    private String candidateId;
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private String phone;
    private String email;
    private int candidateType;

    public Candidate() {
    }

    public Candidate(String candidateId, String firstName, String lastName,
            int birthDate, String address, String phone,
            String email, int candidateType) {

        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCandidateType() {
        return candidateType;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "|" + birthDate + "|" + address + "|" + phone + "|" + email;
    }
}