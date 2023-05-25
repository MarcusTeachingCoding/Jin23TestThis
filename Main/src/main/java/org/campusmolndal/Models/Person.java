/**
 * The Person class represents a person with a name and an age.
 */
package org.campusmolndal.Models;

public class Person {
    private final String name;
    private final int age;

    /**
     * Constructs a Person object with the specified name and age.
     *
     * @param name The name of the person.
     * @param age The age of the person.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns a string representation of the person.
     *
     * @return The string representation of the person.
     */
    @Override
    public String toString() {
        return name + " " + age;
    }
}