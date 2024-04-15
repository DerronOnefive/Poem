/**
 * Poem.java
 *
 * A class representing information about a poem for use in Chapter 5 Exercise 2
 *
 */
public class Poem {

    // Attributes to store the name and poet of the poem
    private String name;
    private String poet;

    /**
     * no-arg constructor
     * Initializes attributes with default values
     */
    public Poem() {
        // initialize attributes
        name = "unknown"; // Default name for the poem
        poet = "unknown"; // Default poet's name
    }

    /**
     * @return the name of the poem
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set for the poem
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the poet's name
     */
    public String getPoet() {
        return poet;
    }

    /**
     * @param poet the poet's name to set for the poem
     */
    public void setPoet(String poet) {
        this.poet = poet;
    }

    /**
     * Override of toString() method to provide a string representation of the Poem object
     */
    @Override
    public String toString() {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }

}
