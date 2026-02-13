package src;

import java.util.*;
import java.util.stream.Collectors;

/*
 * ==========================================================
 * UC 2.3
 * Store transformed values into new List using collect()
 * collect() is a Terminal Operation
 * ==========================================================
 */

public class Collect {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> doubledList = numbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());

        System.out.println("Collected List: " + doubledList);
    }
}

