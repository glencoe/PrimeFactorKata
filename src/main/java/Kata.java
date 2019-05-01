import java.util.ArrayList;
import java.util.List;

public class Kata {


    public static List<Integer> primeFactors(int number) {
        List<Integer> primes = new ArrayList<>();
        while (number > 1){
            if (number % 2 != 0){
                primes.add(number);
                break;
            } else {
                number /= 2;
                primes.add(2);
            }
        }
        return primes;
    }
}
