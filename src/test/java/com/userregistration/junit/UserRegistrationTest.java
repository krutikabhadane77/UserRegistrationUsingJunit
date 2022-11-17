package com.userregistration.junit;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void PhoneNumberCorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePhone("91 8878564543");
        Assert.assertTrue(result);
    }
    @Test
    public void PhoneNumberIncorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePhone("5436546546");
        Assert.assertFalse(result);
    }

    @Test
    public void PasswordCorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePassword("Kpatil#123");
        Assert.assertTrue(result);
    }
    @Test
    public void PasswordIncorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePassword("Kruti12");
        Assert.assertFalse(result);
    }

    @Test
    public void AllEmailSamplesCorrectTest() {
        UserRegistration user=new UserRegistration();
        Assert.assertTrue(user.validateAllEmailSamples("abc@yahoo.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc-100@yahoo.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc.100@yahoo.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc111@abc.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc-100@abc.net"));
        Assert.assertTrue(user.validateAllEmailSamples("abc.100@abc.com.au"));
        Assert.assertTrue(user.validateAllEmailSamples("abc@1.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc@gmail.com.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc+100@gmail.com.com"));
    }

}
