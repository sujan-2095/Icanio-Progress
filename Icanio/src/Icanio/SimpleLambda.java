package Icanio;

import java.util.Arrays;

public class SimpleLambda {
	public static void main(String[] argv) {
		Integer[] arr = {1,2,3,4,5,6};
		Arrays.asList(arr).forEach((n) -> {
			if(n%2 == 0) {
				System.out.println("Even");
			}
		});
	}

}
