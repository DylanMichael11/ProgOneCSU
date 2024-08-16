package personalinfoproject;
/**
 * This class represents a simple application to print personal information.
 * It demonstrates basic variable declaration and console output in Java.It first will declare and call variable.
 * then print them each in the console on new lines using \n.
 */
public class PersonInfo {
    public static void main(String[] args) {
    	// public static void main needed for each java program
        // Declare and initialize variables for personal information
        String firstName = "Naruto";
        String lastName = "Uzimaki";
        String streetAddress = "321 ninja st";
        String city = "leaf";
        String zipCode = "12345";

        /*
         * The following block of code prints each piece
         * of personal information on a separate line.
         */
        System.out.print(firstName + "\n");
        System.out.print(lastName + "\n");
        System.out.print(streetAddress + "\n");
        System.out.print(city + "\n");
        System.out.print(zipCode + "\n");
        // using \n instead of  println just for practice
       
    }
}
