package com.userregistration.junit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    private UserRegistration user;
    @Before
    public void init(){
        user=new UserRegistration();
    }
    @Test
    public void FirstNameCorrectTest() {
        try {
            boolean result = user.validateFirstName.compare("Kruti");
            Assert.assertTrue(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }
    }
    @Test
    public void FirstNameIncorrectTest() {
        try {
            boolean result=user.validateFirstName.compare("kr");
            Assert.assertFalse(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void LastNameCorrectTest() {
        try {
            boolean result=user.validateLastName.compare("Patil");
            Assert.assertTrue(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }
    @Test
    public void LastNameIncorrectTest() {
        try {
            boolean result=user.validateLastName.compare("patil");
            Assert.assertFalse(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void EmailCorrectTest() {
        try {
            boolean result=user.validateEmail.compare("kpatil18@gmail.com");
            Assert.assertTrue(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }
    @Test
    public void EmailIncorrectTest() {
        try {
            boolean result=user.validateEmail.compare("abc.com");
            Assert.assertFalse(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void PhoneNumberCorrectTest() {
        try {
            boolean result=user.validatePhone.compare("91 8878564543");
            Assert.assertTrue(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }
    @Test
    public void PhoneNumberIncorrectTest() {
        try {
            boolean result=user.validatePhone.compare("5436546546");
            Assert.assertFalse(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void PasswordCorrectTest() {
        try {
            boolean result=user.validatePassword.compare("Kpatil#123");
            Assert.assertTrue(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }
    @Test
    public void PasswordIncorrectTest() {
        try {
            boolean result=user.validatePassword.compare("Kruti12");
            Assert.assertFalse(result);
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void AllEmailSamplesCorrectTest() {
        try {
            Assert.assertTrue(user.validateAllEmailSamples.compare("abc@yahoo.com"));
            Assert.assertTrue(user.validateAllEmailSamples.compare("abc-100@yahoo.com"));
            Assert.assertTrue(user.validateAllEmailSamples.compare("abc.100@yahoo.com"));
            Assert.assertTrue(user.validateAllEmailSamples.compare("abc111@abc.com"));
            Assert.assertTrue(user.validateAllEmailSamples.compare("abc-100@abc.net"));
            Assert.assertTrue(user.validateAllEmailSamples.compare("abc.100@abc.com.au"));
            Assert.assertTrue(user.validateAllEmailSamples.compare("abc@1.com"));
            Assert.assertTrue(user.validateAllEmailSamples.compare("abc@gmail.com.com"));
            Assert.assertTrue(user.validateAllEmailSamples.compare("abc+100@gmail.com.com"));
        }catch (InvalidUserDetailsException exception){
            exception.printStackTrace();
        }

    }

}
