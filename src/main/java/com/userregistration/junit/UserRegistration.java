package com.userregistration.junit;
import java.util.regex.Pattern;
public class UserRegistration {
    UserInterface validateFirstName=(fname)-> {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(fname).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("First Name Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_FirstName);
        }
    };

    UserInterface validateLastName=(lname)-> {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(lname).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("Last Name Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_LastName);
        }
    };


    UserInterface validateEmail=(email)-> {
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(email).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("Email Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_Email);
        }
    };

    UserInterface validatePhone=(phone)-> {
        String regex = "(0|91)?[-\\s]?[6-9][0-9]{9}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(phone).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("Phone Number Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_Phone);
        }
    };

    UserInterface validatePassword=(password)-> {
        String regex = "((?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%]).{8,20})";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(password).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("Password Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_Password);
        }
    };

    UserInterface validateAllEmailSamples=(email)-> {
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(email).matches();
        if (check) {
            return check;
        }
        else {
            throw new InvalidUserDetailsException("All Email Samples Invalid Exception", InvalidUserDetailsException.exceptionType.invalid_SampleEmail);
        }
    };
}
