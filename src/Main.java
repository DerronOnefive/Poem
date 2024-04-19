/**Class: Main.java
 * @author Derron Pierre
 * @version 1.0
 * Course: ITEC 2140 Spring 2024
 * Written: April 17, 2024
 */

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        // Create three Poem objects
        Poem poem1 = new Poem(); // Creating a Poem object for the first poem
        poem1.setName("The Road Not Taken"); // Setting the name of the first poem
        poem1.setPoet("Robert Frost"); // Setting the poet's name for the first poem

        Poem poem2 = new Poem(); // Creating a Poem object for the second poem
        poem2.setName("If"); // Setting the name of the second poem
        poem2.setPoet("Rudyard Kipling"); // Setting the poet's name for the second poem

        Poem poem3 = new Poem(); // Creating a Poem object for the third poem
        poem3.setName("The Raven"); // Setting the name of the third poem
        poem3.setPoet("Edgar Allan Poe"); // Setting the poet's name for the third poem

        // Write poem information to a text file
        try {
            FileWriter fileWriter = new FileWriter("poems.txt"); // Creating a FileWriter to write to the file
            PrintWriter printWriter = new PrintWriter(fileWriter); // Creating a PrintWriter to write to the file

            // Write information for poem 1
            printWriter.println(poem1.getName());
            printWriter.println(poem1.getPoet());
            // Write information for poem 2
            printWriter.println(poem2.getName());
            printWriter.println(poem2.getPoet());
            // Write information for poem 3
            printWriter.println(poem3.getName());
            printWriter.println(poem3.getPoet());

            printWriter.close(); // Closing the PrintWriter
            System.out.println("Poems information written to poems.txt successfully."); // Printing success message
        } catch (Exception e) { // Catching any exceptions that occur during file writing
            System.out.println("An error occurred: " + e.getMessage()); // Printing error message
        }
    }
}
