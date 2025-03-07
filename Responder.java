/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * 
 * 
 * 
 * 
 * 
 * @version    0.1 (2016.02.29)
 
*/
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

public class Responder
{
    private ArrayList<String>responses;
    private Random rand_gen;
    private HashMap <String,String> responseMap;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses = new ArrayList<>();
        rand_gen= new Random();
        fillResponses();
        responseMap = new HashMap<>();
    }
     
    
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }
    public void printMultiRandom(int howMany){
        int index=0;
        while(index < howMany){
            System.out.println("New random number [" + (index+1)+"]:" + rand_gen.nextInt(1000));
            index++;
        }
    }
    public String generateResponse(){
        int index = rand_gen.nextInt(responses.size());
        
        
        return responses.get(index);
    }
    public void fillResponses(){
    
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("I'll ask my mom");
        responses.add("I don't know");
        responses.add("we'll see");
    }

}
