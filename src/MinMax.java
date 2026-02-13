package src;
import java.util.*;

/*
 * ==========================================================
 * UC 2.6
 * Find minimum and maximum using min() and max()
 * ==========================================================
 */

public class MinMax {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,5,1,8,2);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        min.ifPresent(m -> System.out.println("Min: " + m));
        max.ifPresent(m -> System.out.println("Max: " + m));
    }
}
