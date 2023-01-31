package com.bl.test.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	static UserRegistration userRegistration;
    @Before
    public  void init(){
        userRegistration = new UserRegistration();
    }
    @Test
    public void firstNmeShouldBeTrue() {
        boolean value = userRegistration.checkFirstName("Sumithra");
        assertEquals(true, value);
    }
        public void firstNmeShouldBeFalse() {
            boolean value = userRegistration.checkFirstName("sumithra");
            assertEquals(false, value);
        }

    @Test
    public void lastNameTest2_ShouldReturnTrue() {
        boolean value = userRegistration.checkLastName("Buddareddy");
        assertEquals(true, value);
    }

    @Test
    public void emailTest3_ShouldReturnTrue() {
        boolean value = userRegistration.checkEmail("sumipavib24@gmail.com");
        assertEquals(true, value);
    }

    @Test
    public void numberTest4_ShouldReturnTrue() {
        boolean value = userRegistration.phoneNumber("91 8956561212");
        assertEquals(true, value);
    }

    @Test
    public void passWordTest5_ShouldReturnTrue() {
        boolean value = userRegistration.passWord("Sumi@123");
        assertEquals(true ,value);
    }

    @Test
    public void testMobileNumberHappy() {
        UserRegistration userValidator = new UserRegistration();
        boolean isValid = userValidator.phoneNumber("91 9994982171");
        assertEquals(true, isValid);
    }



}
