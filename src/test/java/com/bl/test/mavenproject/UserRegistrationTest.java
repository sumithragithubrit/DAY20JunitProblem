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
    public void firstNmeShouldBeTrue(){
        boolean value = userRegistration.checkFirstName("Sumithra");
        assertEquals(true , value);
    }
    @Test
    public void firstNmeShouldBeFalse(){
        boolean value = userRegistration.checkFirstName("sumithra");
        assertEquals(false , value);
    }
    @Test
    public void lastNameTest2_ShouldReturnTrue() {
        boolean value = userRegistration.checkLastName("Buddareddy");
        assertEquals(true, value);
    }
    @Test
    public void lastNameTest2_ShouldReturnFalse() {
        boolean value = userRegistration.checkLastName("buddareddy");
        assertEquals(false, value);
    }

    @Test
    public void emailTest3_ShouldReturnTrue() {
        boolean value = userRegistration.checkEmail("sumipabib24@gmail.com");
        assertEquals(true, value);
    }
    @Test
    public void emailTest3_ShouldReturnFalse() {
        boolean value = userRegistration.checkEmail("Sumipavib24@gmail.com");
        assertEquals(false, value);
    }

    @Test
    public void numberTest4_ShouldReturnTrue() {
        boolean value = userRegistration.phoneNumber("91 8956561212");
        assertEquals(true, value);
    }
    @Test
    public void numberTest4_ShouldReturnFalse() {
        boolean value = userRegistration.phoneNumber("918956561212");
          assertEquals(false, value);
    }

    @Test
    public void passWordTest5_ShouldReturnTrue() {
        boolean value = userRegistration.passWord("Sumi@123");
        assertEquals(true ,value);
    }
    @Test
    public void passWordTest5_ShouldReturnFalse() {
        boolean value = userRegistration.passWord("sumi@123");
        assertEquals(false ,value);
    }




}