package Icanio;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class stream {
    public static int doub(int a) {
        return a * a;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = numbers.stream().map(n->doub(n));
        stream.forEach(n -> System.out.print(n + " "));
    }
}
