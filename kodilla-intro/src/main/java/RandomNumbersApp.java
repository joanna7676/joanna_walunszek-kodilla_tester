import java.util.Random;

public class RandomNumbersApp {
    public static void main(String[] args){
        RandomNumbers random = new RandomNumbers();
        System.out.println("Numbers");

        int result = random.getCountOfRandomNumber(100);
        System.out.println(result);

        random.randomDrawNumber();
    }
}
