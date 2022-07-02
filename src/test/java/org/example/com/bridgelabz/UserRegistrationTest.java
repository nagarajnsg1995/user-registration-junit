package org.example.com.bridgelabz;

import com.bridgelabz.UserRegistration;
import junit.framework.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Nagaraj");
        Assert.assertTrue(result);
    }

    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.validateLastName("Sggadd");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        Assert.assertTrue(result);
    }


    @Test
    public void giveNumberValue_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.numberValidation("91 8748856526");
        Assert.assertTrue(result);
    }


    @Test
    public void givenLoginRule1Values_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginValidationPassword("Nn2@kals");
        Assert.assertTrue(result);


    }
}