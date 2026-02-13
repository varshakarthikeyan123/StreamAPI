package src;

import java.util.*;

/*
 * ==========================================================
 * UC 2.2
 * Transform elements using map()
 * map() is an Intermediate Operation
 * ==========================================================
 */

public class Map {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.stream()
                .map(num -> num * 2)
                .forEach(result ->
                        System.out.println("Doubled: " + result));
    }
}
