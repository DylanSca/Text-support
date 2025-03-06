import java.util.Random;

public class RandomTester
{
    private Random rand_gen;

    
    
    public RandomTester()
    {
        rand_gen = new Random();
    }
    public void printOneRandom(int y)
    {
        System.out.println("New integer:"+ rand_gen.nextInt(1000));
    }
}