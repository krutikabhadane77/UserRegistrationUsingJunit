package com.userregistration.junit;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class ParameterisedTest {
    private final String email;
    private final boolean result;
    UserRegistration user;

    public ParameterisedTest(String email, boolean result) {
        this.email = email;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection TestCases() {
        return Arrays.asList(new Object[][] {
		{"abc@yahoo.com",false},
    	{"abc-100@yahoo.com",true},
    	{"abc.100@yahoo.com",true},
        {"abc111@abc.com",true},
    	{"abc-100@abc.net",true},
		{"abc.100@abc.com.au",true},
		{"abc@1.com",true},
		{"abc@gmail.com.com",true},
		{"abc+100@gmail.com",true},
	    {".abc@abc.com",false},
		{"abc()*@gmail.com",false},
		{"abc@%*.com",false},
		{"abc..2002@gmail.com",false},
	    {"abc.@gmail.com",false},
	    {"abc@abc@gmail.com",false},
	    {"abc@gmail.com.1a",false},
	    {"abc@gmail.com.aa.au",false},
        });
    }

    @Test
    public void validEmailTest() {
        user=new UserRegistration();
        boolean result=user.validateAllEmailSamples(email);
        Assert.assertEquals(email, result);
    }
}

