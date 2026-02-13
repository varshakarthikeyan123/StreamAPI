package src;

import java.util.*;

/*
 * ==========================================================
 * UC 2.1
 * Create a Stream and iterate using forEach()
 * forEach() is a Terminal Operation
 * ==========================================================
 */

public class ForEach {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.stream()
                .forEach(num ->
                        System.out.println("Number: " + num));
    }
}
