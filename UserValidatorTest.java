package com.uservalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean firstName = userValidator.validFirstName("Omprasad");
        Assertions.assertTrue(firstName);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean firstName = userValidator.validFirstName("omprasad");
        Assertions.assertFalse(firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean lastName = userValidator.validLastName("Rathod");
        Assertions.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean lastName = userValidator.validLastName("rathod");
        Assertions.assertFalse(lastName);
    }


}
