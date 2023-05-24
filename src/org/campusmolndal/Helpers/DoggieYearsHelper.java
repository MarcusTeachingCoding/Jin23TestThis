package org.campusmolndal.Helpers;

import org.campusmolndal.People.Person;

public class DoggieYearsHelper {

    public int getDoggieYears(int age) {
        return age * 7;
    }
    public int getDoggieYears(Person person) {
        return person.getAge() * 7;
    }

    public int getCatYears(int age) {
        return age * 7;
    }
    public int getCatYears(Person person) {
        return person.getAge() * 7;
    }

    public int getAgeDifference(int age1, int age2) {
        return Math.abs(age1 - age2);
    }

    public int getAgeDifference(Person person1, Person person2) {
        return Math.abs(person1.getAge() - person2.getAge());
    }

    public String getAgeDifferenceMessage(int age1, int age2) {
        return "The age difference between " + age1 + " and " + age2 + " is " + getAgeDifference(age1, age2) + ".";
    }

    public String getAgeDifferenceMessage(Person person1, Person person2) {
        return "The age difference between " + person1.getName() + " and " + person2.getName() + " is " + getAgeDifference(person1, person2) + ".";
    }

}

