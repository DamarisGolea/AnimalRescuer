package org.fasttrackit;

public class Vet extends Person {
    private String specialty;

    public Vet(String name, String sex) {
        super(name, sex);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

