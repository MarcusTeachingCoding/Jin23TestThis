import org.campusmolndal.Helpers.DoggieYearsHelper;
import org.campusmolndal.People.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DoggieYearsHelperTest {
    Person sut;
    DoggieYearsHelper dyh;
    @BeforeEach
    public void setUp() {
        sut = new Person(10, "Test");
        dyh = new DoggieYearsHelper();
    }

    @AfterEach
    public void tearDown() {
        sut = null;
        dyh = null;
    }

    @org.junit.jupiter.api.Test
    void getDoggieYears() {
        int result = dyh.getDoggieYears(sut);
        assertTrue(result == 70);

        assertTrue(false);
    }

    @org.junit.jupiter.api.Test
    void testGetDoggieYears() {
        assertTrue(false);
    }

    @org.junit.jupiter.api.Test
    void getCatYears() {
        assertTrue(false);
    }

    @org.junit.jupiter.api.Test
    void testGetCatYears() {
        assertTrue(false);
    }

    @org.junit.jupiter.api.Test
    void getAgeDifference() {
        assertTrue(false);
    }

    @org.junit.jupiter.api.Test
    void testGetAgeDifference() {
        assertTrue(false);
    }

    @org.junit.jupiter.api.Test
    void getAgeDifferenceMessage() {
        assertTrue(false);
    }

    @org.junit.jupiter.api.Test
    void testGetAgeDifferenceMessage() {
        assertTrue(false);
    }
}