package com.cbfacademy.words;
import java.lang.CharSequence;

public class ReverseCharSequence implements CharSequence {

    private final String originalString;

    // Constructor to initialise originalString
    public ReverseCharSequence(String originalString) {
        this.originalString = originalString;
    }

    @Override
    public char charAt(int index) {
        // Return character from end of originalString
        return originalString.charAt(originalString.length() -1 - index);
    }

    @Override
    public int length() {
        // Length is same as originalString
        return originalString.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        // Return reverse of subsequence
        return new ReverseCharSequence(originalString.subSequence(start, end).toString());
    }

    @Override
        public String toString() {
            // Return reversed string
            return new StringBuilder(originalString).reverse().toString();
        }

}
