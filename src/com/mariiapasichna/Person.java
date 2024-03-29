package com.mariiapasichna;

public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String birthDate;

    public Person(String fullName) {
        String[] arr = fullName.split(" ");
        this.lastName = arr[0];
        this.firstName = arr[1];
        this.patronymic = arr[2];
    }

    public Person(String firstName, String lastName, String patronymic, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
    }

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + patronymic;
    }
}