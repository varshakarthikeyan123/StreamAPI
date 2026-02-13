package src;
import java.util.*;

/*
 * ==========================================================
 * UC 2.7
 * Calculate sum and average
 * ==========================================================
 */

public class SumAverage {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
