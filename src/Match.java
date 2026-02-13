package src;

import java.util.*;
/*
 * ==========================================================
 * UC 2.8
 * Check allMatch and anyMatch
 * ==========================================================
 */

public class Match {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,6,8);

        boolean allEven = numbers.stream()
                .allMatch(num -> num % 2 == 0);

        boolean anyEven = numbers.stream()
                .anyMatch(num -> num % 2 == 0);

        System.out.println("All Even? " + allEven);
        System.out.println("Any Even? " + anyEven);
    }
}
