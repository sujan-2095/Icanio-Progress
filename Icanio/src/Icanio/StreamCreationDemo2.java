package Icanio;
import java.util.stream.Stream;

public class StreamCreationDemo2 {

    public static void main(String[] args) {

        Stream st;
		st = Stream.iterate(1, n -> n + 1)
                .limit(10);
		
		st.forEach(n -> System.out.println(n));
    }
}