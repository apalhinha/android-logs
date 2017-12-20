package info.trustzone.androidlogs;

/**
 * Created by andre on 2017-12-18.
 * Custom error class
 */

public class CustomError extends Exception {
    private String s1;

    CustomError(String aMessage) {
        s1=aMessage;
    }

    public String toString() {
        return "Error: " +s1;
    }
}
