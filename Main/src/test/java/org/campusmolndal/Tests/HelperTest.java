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

    @org.junit.jupiter.api.Test
    void getTripleAge() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getCatsAge() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getDogYears() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getFromCatYears() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getFromDogYears() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getFromGoldfishYears() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getFromHamsterYears() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getFromHorseYears() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getFromRabbitYears() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getGoldfishYears() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getHamsterYears() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getHorseYears() {
        assertTrue(false); // Test not implemented.
    }

    @org.junit.jupiter.api.Test
    void getRabbitYears() {
        assertTrue(false); // Test not implemented.
    }
}