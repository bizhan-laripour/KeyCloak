package net.dpco.keycloak.entity;


public class Member {

    private String name;

    private String lastName;

    private String nationalCode;

    private String gender;


    public Member(String name, String lastName, String nationalCode, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
