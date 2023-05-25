/**
 * The Person class represents an individual with an age and a name.
 */
package org.campusmolndal.People;

public class Person {
    public int age;
    public String name;

    /**
     * Constructs a Person object with the specified age and name.
     *
     * @param age  The age of the person.
     * @param name The name of the person.
     */
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Generates a greeting message with the person's name and age.
     *
     * @return A greeting message.
     */
    public String sayHello() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }

    /**
     * Retrieves the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Retrieves the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }
}