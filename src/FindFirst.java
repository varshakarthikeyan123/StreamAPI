package src;

import java.util.*;

/*
 * ==========================================================
 * UC 2.5
 * Find first even number using findFirst()
 * ==========================================================
 */

public class FindFirst {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        Optional<Integer> firstEven = numbers.stream()
                .filter(num -> num % 2 == 0)
                .findFirst();

        firstEven.ifPresent(num ->
                System.out.println("First Even: " + num));
    }
}