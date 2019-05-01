import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorTest {

    private List<Integer> list(int... numbers) {
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        return list;
    }

    @Test
    public void one(){
        assertEquals(list(),
                Kata.primeFactors(1));
    }

    @Test
    public void two() {
        assertEquals(list(2),
                Kata.primeFactors(2));
    }

    @Test
    public void three() {
        assertEquals(list(3),
                Kata.primeFactors(3));
    }

    @Test
    public void four() {
        assertEquals(list(2,2),
                Kata.primeFactors(4));
    }

    @Test
    void five() {
        assertEquals(list(5),
                Kata.primeFactors(5));
    }
}