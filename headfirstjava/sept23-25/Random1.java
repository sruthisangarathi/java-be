
import java.util.Random;
public class Random1 {
    public static void main(String[] args) {
        Random random = new Random();
        //  int rand= (int)(Math.random()*10);
        int randomNumberInt = random.nextInt(100); 
        double randomNumberDouble = random.nextDouble(); 
        boolean randomBoolean = random.nextBoolean(); 

        System.out.println("Random int: " + randomNumberInt);
        System.out.println("Random double: " + randomNumberDouble);
        System.out.println("Random boolean: " + randomBoolean);
    }
}

