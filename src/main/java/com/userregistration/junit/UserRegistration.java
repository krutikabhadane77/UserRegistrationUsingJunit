package com.userregistration.junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public boolean validateFirstName(String fname) {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(fname);
        boolean check=pattern.matcher(fname).matches();
        return check;
    }

    public boolean validateLastName(String lname) {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(lname);
        boolean check=pattern.matcher(lname).matches();
        return check;
    }

    public boolean validateEmail(String email) {
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        boolean check=pattern.matcher(email).matches();
        return check;
    }
}
