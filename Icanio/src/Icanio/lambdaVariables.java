package Icanio;

@FunctionalInterface
interface Calculator<t> {
    t calculate(t a, t b);
}

public class lambdaVariables {
    public static void main(String[] args) {

        Calculator<Integer> add = (a, b) -> a + b;

        int result = add.calculate(10, 20);

        System.out.println(result);
    }
}