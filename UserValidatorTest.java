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
    public void givenLastName_WhenNotProper_ShouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean lastName = userValidator.validLastName("rathod");
        Assertions.assertFalse(lastName);
    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean emailAddress = userValidator.validEmailAddress("abc@yahoo.com");
        Assertions.assertTrue(emailAddress);
    }

    @Test
    public void givenEmailAddress_WhenNotProper_ShouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean emailAddress = userValidator.validEmailAddress("abc@.com.au");
        Assertions.assertTrue(emailAddress);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean phoneNumber = userValidator.validEmailAddress("91 6849756812");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean phoneNumber = userValidator.validEmailAddress("916849746812");
        Assertions.assertFalse(phoneNumber);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturntrue() {
        UserValidator userValidator = new UserValidator();
        boolean password = userValidator.validPassword("Omprasad@123");
        Assertions.assertEquals(true,password);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnfalse() {
        UserValidator userValidator = new UserValidator();
        boolean password = userValidator.validPassword("Omprasad");
        Assertions.assertEquals(false,password);
    }
}
