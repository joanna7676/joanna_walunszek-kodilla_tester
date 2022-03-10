import java.util.Random;

public class RandomNumbers {

    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
            return result;
    }
    public void randomDrawNumber() {
        Random random = new Random();
        int max = 0;
        int min = 30;
        int sum = 0;
        while (sum < 5000) {
            int i = random.nextInt(30);
            sum = sum + i;
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("minimum  " + min);
        System.out.println("maximum  " + max);
    }

            }

