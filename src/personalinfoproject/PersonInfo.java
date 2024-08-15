package personalinfoproject;
/**
 * This class represents a simple application to print personal information.
 * It demonstrates basic variable declaration and console output in Java.
 */
public class PersonInfo {
    public static void main(String[] args) {
    	// public static void main needed for each java program
        // Declare and initialize variables for personal information
        String firstName = "John";
        String lastName = "Doe";
        String streetAddress = "123 Main St";
        String city = "Anytown";
        String zipCode = "12345";

        /*
         * The following block of code prints each piece
         * of personal information on a separate line.
         */
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(streetAddress);
        System.out.println(city);
        System.out.println(zipCode);
    }
}