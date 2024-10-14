
/**
 * Write a description of class Salute here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salute
{
    // instance variables - replace the example below with your own
    private String greetText;

    /**
     * Constructor for objects of class Salute
     */
    public Salute()
    {
        // initialise instance variables
        greetText = "Hello";
    }

    /**
     * A salute method
     */
    public String salutePerson(String inName)    {
        // put your code here
        return greetText + " " + inName;
    }
}
