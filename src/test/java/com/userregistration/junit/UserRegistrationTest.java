package com.userregistration.junit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class UserRegistrationTest {
    private UserRegistration user;
    @Before
    public void init(){
        user=new UserRegistration();
    }
    @Test
    public void FirstNameCorrectTest() {
        try {
            boolean result = user.validateFirstName("Kruti");
            Assert.assertTrue(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }
    }
    @Test
    public void FirstNameIncorrectTest() {
        try {
            boolean result=user.validateFirstName("kr");
            Assert.assertFalse(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void LastNameCorrectTest() {
        try {
            boolean result=user.validateLastName("Patil");
            Assert.assertTrue(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }
    @Test
    public void LastNameIncorrectTest() {
        try {
            boolean result=user.validateLastName("patil");
            Assert.assertFalse(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void EmailCorrectTest() {
        try {
            boolean result=user.validateEmail("kpatil18@gmail.com");
            Assert.assertTrue(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }
    @Test
    public void EmailIncorrectTest() {
        try {
            boolean result=user.validateEmail("abc.com");
            Assert.assertFalse(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void PhoneNumberCorrectTest() {
        try {
            boolean result=user.validatePhone("91 8878564543");
            Assert.assertTrue(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }
    @Test
    public void PhoneNumberIncorrectTest() {
        try {
            boolean result=user.validatePhone("5436546546");
            Assert.assertFalse(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void PasswordCorrectTest() {
        try {
            boolean result=user.validatePassword("Kpatil#123");
            Assert.assertTrue(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }
    @Test
    public void PasswordIncorrectTest() {
        try {
            boolean result=user.validatePassword("Kruti12");
            Assert.assertFalse(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void AllEmailSamplesCorrectTest() {
        try {
            Assert.assertTrue(user.validateAllEmailSamples("abc@yahoo.com"));
            Assert.assertTrue(user.validateAllEmailSamples("abc-100@yahoo.com"));
            Assert.assertTrue(user.validateAllEmailSamples("abc.100@yahoo.com"));
            Assert.assertTrue(user.validateAllEmailSamples("abc111@abc.com"));
            Assert.assertTrue(user.validateAllEmailSamples("abc-100@abc.net"));
            Assert.assertTrue(user.validateAllEmailSamples("abc.100@abc.com.au"));
            Assert.assertTrue(user.validateAllEmailSamples("abc@1.com"));
            Assert.assertTrue(user.validateAllEmailSamples("abc@gmail.com.com"));
            Assert.assertTrue(user.validateAllEmailSamples("abc+100@gmail.com.com"));
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

}
