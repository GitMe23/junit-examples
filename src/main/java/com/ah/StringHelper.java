package com.ah;

public class StringHelper {

    public String truncateAinFirstTwoLetters(String str) {

        if (str.length() <=2 ) {
            return str.replaceAll( "[Aa]", "");
        }

        String firstTwoLetters = str.substring(0,2);
        String restOfString = str.substring(2);

        return firstTwoLetters.replaceAll("[Aa]", "") + restOfString;
    }
}
