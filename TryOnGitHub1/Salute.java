
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
        greetText = "Halooo ";
    }

    /**
     * A salute method
     */
    public String salutePerson(String inName)    {
        // put your code here
        return greetText + " " + inName;
    }
    
    /**
     * Another salute method
     */
    public void salutePerson(String inName1, String inName2)    {
        // put your code here
        String foundGreet = greetText + " " + inName1 + "\r\n";
        foundGreet += greetText + " " + inName2;
        System.out.println(foundGreet);
    }
}
