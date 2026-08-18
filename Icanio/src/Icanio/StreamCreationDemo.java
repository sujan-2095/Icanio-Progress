package Icanio;
import java.util.stream.Stream;

public class StreamCreationDemo {

	public static void print(int n) {
			System.out.println(n);
	}
    public static void main(String[] args) {
    	Integer[] arr = {10,20,30,40,50};
        Stream.of(arr)
                .forEach(n -> print(n));

        Stream.of("Java", "Spring", "React")
                .forEach(System.out::println);
    }
}