package Icanio;
import java.util.*;

public class StreamIntermediateDemo {

    public static void main(String[] args) {

        // 1. filter()
        System.out.println("---- filter() ----");

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        numbers.stream()
                .filter(n -> n > 20)
                .forEach(System.out::println);


        // 2. map()
        System.out.println("\n---- map() ----");

        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);


        // 3. flatMap()
        System.out.println("\n---- flatMap() ----");

        List<List<String>> names = Arrays.asList(
                Arrays.asList("Sujan", "Rahul"),
                Arrays.asList("Arun", "Kumar"),
                Arrays.asList("John", "David")
        );

        names.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);


        // 4. distinct()
        System.out.println("\n---- distinct() ----");

        List<Integer> duplicateNumbers =
                Arrays.asList(10, 20, 20, 30, 30, 30, 40);

        duplicateNumbers.stream()
                .distinct()
                .forEach(System.out::println);


        // 5. sorted()
        System.out.println("\n---- sorted() ----");

        List<Integer> unsortedNumbers =
                Arrays.asList(50, 10, 40, 20, 30);

        unsortedNumbers.stream()
                .sorted()
                .forEach(System.out::println);


        // 6. peek()
        System.out.println("\n---- peek() ----");

        numbers.stream()
                .filter(n -> n > 15)
                .peek(n -> System.out.println("After filter: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("After map: " + n))
                .forEach(System.out::println);


        // 7. limit()
        System.out.println("\n---- limit() ----");

        numbers.stream()
                .limit(3)
                .forEach(System.out::println);


        // 8. skip()
        System.out.println("\n---- skip() ----");

        numbers.stream()
                .skip(2)
                .forEach(System.out::println);


        // Combining multiple intermediate operations
        System.out.println("\n---- Combined Example ----");

        numbers.stream()
                .filter(n -> n > 10)       // keep numbers > 10
                .map(n -> n * 2)           // multiply by 2
                .distinct()                // remove duplicates
                .sorted()                  // sort
                .peek(n -> System.out.println("Before limit: " + n))
                .skip(1)                   // skip first
                .limit(2)                  // take next 2
                .forEach(n -> System.out.println("Final: " + n));
    }
}