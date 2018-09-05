package com.unittest.abircse.junittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * here test paake class name must be rename with which
 * class i wanna test and add Test word too with class name e.g i
 * have class called abir & in unit test i have to rename is as abirTest
 * for all test case need to use @Test Attoniation
 */

public class LoginUtilsTest {

    private LoginUtils utils;

    //----this is for before state of Unit test we write this method here----//
    @Before
    public void setUp()
    {
        utils = new LoginUtils();
    }

    //-----first test email is valid-----//
    @Test
    public void aValidEmailAdressPasses() throws Exception
    {
        assertTrue(utils.isValidEmailAddress("abir@gmail.com"));
    }

    //---second test email is unvalid-----//
    @Test
    public void anInValidEmailAddressFails() throws Exception
    {
        assertFalse(utils.isValidEmailAddress("Invalid"));
    }

    //---Third method is for check the local part length of valid email address----//
    @Test
    public void localPartLenthForValidEmailAddress() throws Exception
    {
        //----here 4 is the length of local part charavter which is out Expected----///
        assertEquals(4, utils.getLocalPartLength("abir@gmail.com"));
    }


}