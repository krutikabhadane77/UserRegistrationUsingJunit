package com.userregistration.junit;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
    @Test
    public void FirstNameCorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("Kruti");
        Assert.assertTrue(result);
    }
    @Test
    public void FirstNameIncorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("kr");
        Assert.assertFalse(result);
    }

    @Test
    public void LastNameCorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateLastName("Patil");
        Assert.assertTrue(result);
    }
    @Test
    public void LastNameIncorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateLastName("patil");
        Assert.assertFalse(result);
    }

    @Test
    public void EmailCorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateEmail("kpatil18@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void EmailIncorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateEmail("abc.com");
        Assert.assertFalse(result);
    }
}
