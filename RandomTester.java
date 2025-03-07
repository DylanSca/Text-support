import java.util.Random;
import java.util.ArrayList;
public class RandomTester
{
    private Random rand_gen;
    private ArrayList<String> responses;
    
    
    
    public RandomTester()
    {
        rand_gen = new Random();
        responses = new ArrayList<>();
        
        fillResponses();
        
    }
    public void fillResponses(){
    
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("I'll ask my mom");
        responses.add("I don't know");
        responses.add("we'll see");
    }
    
    public void printOneRandom()
    {
        System.out.println("New integer:"+ rand_gen.nextInt(1000));
    }
    public void printMultiRandom(int howMany){
        int index=0;
        while(index < howMany){
            System.out.println("New random number [" + (index+1)+"]:" + rand_gen.nextInt(1000));
            index++;
        }
    }
    public String getResponse(){
        int index= rand_gen.nextInt(3);
        if(index==0){
            return"yes";
        }
        else if(index==1){
            return "no";
        }
        else{
            return "maybe";
        }
        }
    public String getBetterResponse(){
        int index = rand_gen.nextInt(responses.size());
        return responses.get(index);
    }
}