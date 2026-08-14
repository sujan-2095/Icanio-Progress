import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        // Create an ArrayList of Characters
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');

        System.out.println("Original List: " + list);

        // Create an unmodifiable view
        List<Character> immutableList = Collections.unmodifiableList(list);

        System.out.println("Unmodifiable List: " + immutableList);
    }
}