import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTest {

    private List<Integer> list(int... numbers){
        List<Integer> list = new ArrayList<>();
        for (Integer number : numbers) {
            list.add(number);
        }
        return list;
    }

    @Test
    void one() {
        assertEquals(list(), Kata.primeFactors(1));
    }

    @Test
    void two() {
        assertEquals(list(2), Kata.primeFactors(2));
    }

    @Test
    void three() {
        assertEquals(list(3), Kata.primeFactors(3));
    }

    @Test
    void four() {
        assertEquals(list(2,2), Kata.primeFactors(4));
    }

}