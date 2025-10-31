import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(Lifecycle.PER_CLASS)
public class PersonTest {
    private Person person;

    @BeforeAll
    void setup() {
        person = new Person();
    }

    @Test
    void check_user_valid() {
        assertTrue(person.checkUser("PaulMcCartney2"));
        assertTrue(person.checkUser("NeilArms2"));
    }

    @Test
    void check_user_not_valid() {
        assertFalse(person.checkUser("Paul#McCartney"));
        assertFalse(person.checkUser("Neil@Arms"));
    }

    @Test
    void does_not_have_letters() {
        assertFalse(person.checkPassword("123456789"));
        assertFalse(person.checkPassword("#$%1234"));
    }

    @Test
    void does_not_have_numbers() {
        assertFalse(person.checkPassword("Abcabcdefgh@"));
        assertFalse(person.checkPassword("#hbtn@%tc"));
    }

    @Test
    void does_not_have_eight_chars() {
        assertFalse(person.checkPassword("Abc@123"));
        assertFalse(person.checkPassword("12$@hbt"));
    }

    @Test
    void check_password_valid() {
        assertTrue(person.checkPassword("abC123456$"));
        assertTrue(person.checkPassword("Hbtn@1234"));
        assertTrue(person.checkPassword("Betty@1#2"));
        assertTrue(person.checkPassword("Hbtn@123"));
    }
}
