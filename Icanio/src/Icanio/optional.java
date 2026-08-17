package Icanio;

import java.util.Optional;

public class optional {

    public static void main(String[] args) {

        // 1. of()
        Optional<String> name = Optional.of("Sujan");
        System.out.println("of(): " + name);


        // 2. ofNullable()
        String value = null;
        Optional<String> nullableValue = Optional.ofNullable(value);
        System.out.println("ofNullable(): " + nullableValue);


        // 3. isPresent()
        if (name.isPresent()) {
            System.out.println("isPresent(): Name is available");
        }


        // 4. orElse()
        String result = nullableValue.orElse("Default Name");
        System.out.println("orElse(): " + result);


        // 5. orElseThrow()
        String result2 = name.orElseThrow(
                () -> new RuntimeException("Name not found")
        );
        System.out.println("orElseThrow(): " + result2);


        // 6. map()
        Optional<String> upperName =
                name.map(n -> n.toUpperCase());

        System.out.println("map(): " + upperName);


        // 7. filter()
        Optional<String> filteredName =
                name.filter(n -> n.length() > 3);

        System.out.println("filter(): " + filteredName);
    }
}