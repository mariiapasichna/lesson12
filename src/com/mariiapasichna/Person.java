package com.mariiapasichna;

public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String birthDate;
    private String fullName;
    private String lastName1;
    private String firstName1;
    private String patronymic1;

    public Person(String fullName) {
        String[] arr = fullName.split(" ");
        this.fullName = fullName;
        this.lastName1 = arr[0];
        this.firstName1 = arr[1];
        this.patronymic1 = arr[2];
    }

    public String getLastName1() {
        return lastName1;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public String getPatronymic1() {
        return patronymic1;
    }

    public String getFullName() {
        return fullName;
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
}