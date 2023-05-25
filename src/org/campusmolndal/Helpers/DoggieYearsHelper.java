/**
 * The DoggieYearsHelper class provides methods for calculating age in dog years and cat years,
 * as well as determining the age difference between two individuals.
 */
package org.campusmolndal.Helpers;

import org.campusmolndal.People.Person;

public class DoggieYearsHelper {

    /**
     * Calculates the age in dog years based on the specified age.
     *
     * @param age The age in human years.
     * @return The age in dog years.
     */
    public int getDoggieYears(int age) {
        return age * 7;
    }

    /**
     * Calculates the age in dog years based on the specified person's age.
     *
     * @param person The person object representing an individual.
     * @return The age in dog years.
     */
    public int getDoggieYears(Person person) {
        return person.getAge() * 7;
    }

    /**
     * Calculates the age in cat years based on the specified age.
     *
     * @param age The age in human years.
     * @return The age in cat years.
     */
    public int getCatYears(int age) {
        return age * 7;
    }

    /**
     * Calculates the age in cat years based on the specified person's age.
     *
     * @param person The person object representing an individual.
     * @return The age in cat years.
     */
    public int getCatYears(Person person) {
        return person.getAge() * 7;
    }

    /**
     * Calculates the absolute difference in age between two ages.
     *
     * @param age1 The first age.
     * @param age2 The second age.
     * @return The absolute difference in age.
     */
    public int getAgeDifference(int age1, int age2) {
        return Math.abs(age1 - age2);
    }

    /**
     * Calculates the absolute difference in age between two individuals.
     *
     * @param person1 The first person object representing an individual.
     * @param person2 The second person object representing an individual.
     * @return The absolute difference in age.
     */
    public int getAgeDifference(Person person1, Person person2) {
        return Math.abs(person1.getAge() - person2.getAge());
    }

    /**
     * Generates a message describing the age difference between two ages.
     *
     * @param age1 The first age.
     * @param age2 The second age.
     * @return A message describing the age difference.
     */
    public String getAgeDifferenceMessage(int age1, int age2) {
        return "The age difference between " + age1 + " and " + age2 + " is " + getAgeDifference(age1, age2) + ".";
    }

    /**
     * Generates a message describing the age difference between two individuals.
     *
     * @param person1 The first person object representing an individual.
     * @param person2 The second person object representing an individual.
     * @return A message describing the age difference.
     */
    public String getAgeDifferenceMessage(Person person1, Person person2) {
        return "The age difference between " + person1.getName() + " and " + person2.getName() + " is " + getAgeDifference(person1, person2) + ".";
    }
}