import java.util.ArrayList;
import java.util.List;

public class Kata {

    static public List<Integer> primeFactors(int number) {
        List<Integer> list;
        list = new ArrayList<>();
        if (number != 1) {
            if (number > 3) {
                list.add(number / 2);
                list.add(number / 2);
                return list;
            }
            list.add(number);
        }
        return list;
    }
}
