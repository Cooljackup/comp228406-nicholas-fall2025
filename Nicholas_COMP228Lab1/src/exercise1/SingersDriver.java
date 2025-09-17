// COMP228-406 - Lab 1 - Nicholas Bonneville
// Lab 1 - Exercise 1

// Write a Java application that creates a Java console application to keep records of singers and displays stored records.

package exercise1;

public class SingersDriver {
    public static void main(String[] args) {

        // Create the singer1 object using the no argument constructor, then print it.
        Singers singer1 = new Singers();
        System.out.println("----------");
        System.out.println("Default values for singer1:");
        System.out.println("Singer ID: " + singer1.getSingerID());
        System.out.println("Singer Name: " + singer1.getSingerName());
        System.out.println("Singer Address: " + singer1.getSingerAddress());
        System.out.println("Singer Date of Birth: " + singer1.getSingerDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getAlbumsPublished());
        System.out.println("----------\n\n");

        // Set all the values using the constructor.
        singer1.setAllSingerValues(1, "AJR", "123 Main Street, Bayside, NY 11361", "January 1st, 2005", 5);
        System.out.println("----------");
        System.out.println("After setting all variables for singer1:");
        System.out.println("Singer ID: " + singer1.getSingerID());
        System.out.println("Singer Name: " + singer1.getSingerName());
        System.out.println("Singer Address: " + singer1.getSingerAddress());
        System.out.println("Singer Date of Birth: " + singer1.getSingerDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getAlbumsPublished());
        System.out.println("----------\n\n");

        // Set values using the setters individually.
        singer1.setSingerID(2);
        singer1.setSingerName("Tom Cochrane");
        singer1.setSingerAddress("123 Secondary Avenue, Vancouver, BC V5C 6N5");
        singer1.setSingerDateOfBirth("May 14th, 1953");
        singer1.setAlbumsPublished(17);
        System.out.println("----------");
        System.out.println("After setting each value separately for singer1:");
        System.out.println("Singer ID: " + singer1.getSingerID());
        System.out.println("Singer Name: " + singer1.getSingerName());
        System.out.println("Singer Address: " + singer1.getSingerAddress());
        System.out.println("Singer Date of Birth: " + singer1.getSingerDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getAlbumsPublished());
        System.out.println("----------\n\n");
    }
}