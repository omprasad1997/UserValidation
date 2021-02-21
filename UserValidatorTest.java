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

}
