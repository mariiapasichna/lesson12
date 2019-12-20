package com.mariiapasichna;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Main {

    /*1) Написать класс Person, у которого если следующие поля:
- Фамилия, Имя, Отчество, дата рождения.
Написать конструкторы:
- на все поля,
- только на ФИО
- который принимает 1 параметр - строку с полным именем "Иванов Иван Иванович", и задает отдельные значения в поля Фамилия, Имя, Отчество.
Написать методы:
- который возвращает полное ФИО типа "Иванов Иван Иванович"
- краткое ФИО типа "Иванов И. И."
- который на основе даты рождения выводит количество полных лет.

2*) Дата рождения задается как строка типа "18.12.1985"*/

    public static void main(String[] args) throws ParseException {
        Person person = new Person("Mariia", "Pasichna", "Volodimirivna", "18.03.1985");
        getFullName(person);
        getShortName(person);
        getAge(person);
    }

    private static int getAge(Person person) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDay = format.parse(person.getBirthDate());
        LocalDate date = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthDay.getYear() + 1900, birthDay.getMonth() + 1, birthDay.getDay());
        int age = Period.between(birthDate, date).getYears();
        System.out.println(age);
        return age;
    }

    private static StringBuilder getShortName(Person person) {
        StringBuilder shortName = new StringBuilder(person.getLastName());
        shortName.append(" ");
        shortName.append(person.getFirstName(), 0, 1);
        shortName.append(". ");
        shortName.append(person.getPatronymic(), 0, 1);
        shortName.append(".");
        System.out.println(shortName);
        return shortName;
    }

    public static StringBuilder getFullName(Person person) {
        StringBuilder fullName = new StringBuilder();
        fullName.append(person.getLastName());
        fullName.append(" ");
        fullName.append(person.getFirstName());
        fullName.append(" ");
        fullName.append(person.getPatronymic());
        System.out.println(fullName);
        return fullName;
    }
}
