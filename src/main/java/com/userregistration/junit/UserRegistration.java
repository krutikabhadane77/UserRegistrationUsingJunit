package com.userregistration.junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public boolean validateFirstName(String fname)throws InvalidUserDetailsException {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(fname).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("First Name Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_FirstName);
        }
    }

    public boolean validateLastName(String lname)throws InvalidUserDetailsException {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(lname).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("Last Name Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_LastName);
        }
    }

    public boolean validateEmail(String email)throws InvalidUserDetailsException {
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(email).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("Email Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_Email);
        }
    }

    public boolean validatePhone(String phone)throws InvalidUserDetailsException {
        String regex = "(0|91)?[-\\s]?[6-9][0-9]{9}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(phone).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("Phone Number Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_Phone);
        }
    }

    public boolean validatePassword(String password)throws InvalidUserDetailsException {
        String regex = "((?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%]).{8,20})";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(password).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("Password Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_Password);
        }
    }

    public boolean validateAllEmailSamples(String email)throws InvalidUserDetailsException {
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(email).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("All Email Samples Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_SampleEmail);
        }
    }
}
