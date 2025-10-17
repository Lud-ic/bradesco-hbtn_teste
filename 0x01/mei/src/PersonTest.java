import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    private static Person person;

    @BeforeAll
    public static void setup() {
        person = new Person();
        person.setName("Paul");
        person.setSurname("McCartney");
        person.setBirthDate(new Date(2000));
        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);
    }

    @Test
    public void show_full_name() {
        Person person = new Person();
        person.setName("Paul");
        person.setSurname("McCartney");
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        Person person = new Person();
        person.setSalary(1200f);
        assertEquals(14400f, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI() {
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        person.setSalary(1000f);
        org.junit.jupiter.api.Assertions.assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        person.setAnotherCompanyOwner(false);
        person.setPensioner(true);
        person.setPublicServer(false);
        person.setSalary(1000f);
        org.junit.jupiter.api.Assertions.assertFalse(person.isMEI());
    }
}
