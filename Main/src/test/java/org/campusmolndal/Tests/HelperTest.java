package org.campusmolndal.Tests;

import org.campusmolndal.Helpers.Helper;
import org.campusmolndal.Models.Person;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class HelperTest {

    Person person;
    Helper sut;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        person = new Person("Clark Kent", 37);
        sut = new Helper();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        person = null;
        sut = null;
    }

    @org.junit.jupiter.api.Test
    void getDoubleAge() {
        // Arrange
        int expected = 74; // Demo person is 37 years old, so double age is 74.

        // Act
        int actual = sut.getDoubleAge(person);

        // Assert
        assertEquals(expected, actual);
    }
}