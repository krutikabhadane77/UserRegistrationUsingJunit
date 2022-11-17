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
        try(validateFirstName(fname)) {

        }
    }
}
