package src;

import java.util.*;


/*
 * ==========================================================
 * UC 2.9
 * Sort numbers using sorted()
 * ==========================================================
 */

public class Sorted {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,1,8,3,2);

        List<Integer> sortedList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted List: " + sortedList);
    }
}
