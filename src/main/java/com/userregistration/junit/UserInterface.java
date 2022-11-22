package com.userregistration.junit;
@FunctionalInterface
public interface UserInterface {
    boolean compare(String input)throws InvalidUserDetailsException;
}
