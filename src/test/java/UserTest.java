import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.userregistration.UserRegistrationPortal;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    //tests for First name
    @ParameterizedTest
    @ValueSource(strings = {"Priyanka","pr","priyanka","PriYANKA","Abc","xyz"})
    public void fName(String data){
        assertTrue(UserRegistrationPortal.firstName(data));
    }

    //test for last name
    @ParameterizedTest
    @ValueSource(strings = {"Sengupta","SENGUPTA","sen","Sg","132sen","sengupta"})
    public void lName(String data){
        assertTrue(UserRegistrationPortal.lastName(data));
    }

    //test for email
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com",
    "abc-100@yahoo.com",
    "abc.100@yahoo.com",
    "abc111@abc.com",
    "abc-100@abc.net",
    "abc.100@abc.com.au",
    "abc@1.com",
    "abc+100@gmail.com",
    "abc",
    "abc@.com.my",
    "abc123@gmail.a",
    "abc123@.com",
    "abc123@.com.com",
    ".abc@abc.com",
    "abc()*@gmail.com",
    "abc@%*.com",
    "abc..2002@gmail.com",
    "abc.@gmail.com",
    "abc@abc@gmail.com",
    "abc@gmail.com.1a",
    "abc@gmail.com.aa.au"})
    public void email(String data){
        assertTrue(UserRegistrationPortal.EmailId(data));
    }

    //validate phone number
    @ParameterizedTest
    @ValueSource(strings = {"+918240531168","8240531168","91 8240531168","91 12345","91 1234567890"})
    public void phoneNumber(String data){
        assertTrue(UserRegistrationPortal.phoneNo(data));
    }

    //validate password
    @ParameterizedTest
    @ValueSource(strings = {"Hello@1234!", "hiiWorld$", "Pass12#&", "zforU&12"})
    public void password(String data){
        assertTrue(UserRegistrationPortal.password(data));
    }
}