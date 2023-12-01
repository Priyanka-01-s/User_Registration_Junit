import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import org.junit.Test;
//import org.junit.jupiter.api.Test;
import com.userregistration.UserRegistrationPortal; 

public class Test {

    private UserRegistrationPortal validator = new UserRegistrationPortal();

    //@Test
    @org.junit.jupiter.api.Test
    public void testHappyPath() {
        assertTrue(validator.firstName("Priyanka"));
        assertTrue(validator.lastName("Sengupta"));
        assertTrue(validator.EmailId("ps23@abc.com"));
        assertTrue(validator.phoneNo("1234567890"));
        assertTrue(validator.password("Hello@1234"));
    }

    // Sad Test Cases

    @org.junit.jupiter.api.Test
	void sadTestForUser() {
		assertTrue(validator.firstName("priyanka"));
		assertTrue(validator.lastName("sengupta"));
		assertTrue(validator.EmailId("abccom"));
		assertTrue(validator.phoneNo("1234890"));
		assertFalse(validator.password("d1234"));
	
	}
}
