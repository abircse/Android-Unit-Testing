package com.unittest.abircse.junittest;

public class LoginUtils {


    /**
     * Firstly, This method checks if the provided string represents a
     * valid email address and returns true if it is.
     * @param email
     * @return
     */

    ///--Check valid email address----//
    public boolean isValidEmailAddress(String email)
    {
        boolean hasAtSign = email.indexOf("@") > -1;
        return hasAtSign;
    }

    /**
     * ow check what are the localpart of and email address
     * E.g: abir@gmail.com is a email address where abir is a local part
     *
     * This method the localpart length
     * @param email
     * @return
     */

    public int getLocalPartLength(String email)
    {
        int Start = email.indexOf("@");
        String LocalPart = email.substring(0,Start);
        return LocalPart.length();
    }




}



