package org.campusmolndal.People;

public class Person {
    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String sayHello() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
