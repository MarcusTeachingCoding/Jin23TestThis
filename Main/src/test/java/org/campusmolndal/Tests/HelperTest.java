package org.campusmolndal.Tests;

import org.campusmolndal.Helpers.Helper;
import org.campusmolndal.Models.Person;

import static org.junit.jupiter.api.Assertions.*;

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
    }

    @org.junit.jupiter.api.Test
    void getCatsAge() {
    }

    @org.junit.jupiter.api.Test
    void getDogYears() {
    }

    @org.junit.jupiter.api.Test
    void getFromCatYears() {
    }

    @org.junit.jupiter.api.Test
    void getFromDogYears() {
    }

    @org.junit.jupiter.api.Test
    void getFromGoldfishYears() {
    }

    @org.junit.jupiter.api.Test
    void getFromHamsterYears() {
    }

    @org.junit.jupiter.api.Test
    void getFromHorseYears() {
    }

    @org.junit.jupiter.api.Test
    void getFromRabbitYears() {
    }

    @org.junit.jupiter.api.Test
    void getGoldfishYears() {
    }

    @org.junit.jupiter.api.Test
    void getHamsterYears() {
    }

    @org.junit.jupiter.api.Test
    void getHorseYears() {
    }

    @org.junit.jupiter.api.Test
    void getRabbitYears() {
    }
}