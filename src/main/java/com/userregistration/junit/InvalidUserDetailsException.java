package com.userregistration.junit;

public class InvalidUserDetailsException extends Exception{
    enum exceptionType{
        invalid_FirstName,invalid_LastName,invalid_Email,invalid_Phone,invalid_Password,invalid_SampleEmail;
    }
    exceptionType type;
    public InvalidUserDetailsException(String msg,exceptionType type){
        super(msg);
        this.type=type;
    }
}
