package Icanio;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceDemo {

    // Normal class method
    static class Calculator {

        // Static method
        static int add(int a, int b) {
            return a + b;
        }

        static int multiply(int a, int b) {
            return a * b;
        }
    }

    // Instance method
    static class Printer {

        void print(String message) {
            System.out.println("Message: " + message);
        }
    }

    // Constructor
    static class Student {

        String name;

        Student(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("Student: " + name);
        }
    }

    public static void main(String[] args) {

        // =====================================================
        // 1. LAMBDA
        // =====================================================

        BiFunction<Integer, Integer, Integer> addition =
                (a, b) -> a + b;

        System.out.println(addition.apply(10, 20));


        // =====================================================
        // 2. STATIC METHOD REFERENCE
        // =====================================================

        BiFunction<Integer, Integer, Integer> add =
                Calculator::add;

        System.out.println(add.apply(10, 20));


        // =====================================================
        // 3. ANOTHER STATIC METHOD REFERENCE
        // =====================================================

        BiFunction<Integer, Integer, Integer> multiply =
                Calculator::multiply;

        System.out.println(multiply.apply(10, 20));


        // =====================================================
        // 4. INSTANCE METHOD REFERENCE
        // =====================================================

        Printer printer = new Printer();

        Consumer<String> printerFunction =
                printer::print;

        printerFunction.accept("Hello Java");


        // =====================================================
        // 5. CONSTRUCTOR REFERENCE
        // =====================================================

        Function<String, Student> studentCreator =
                Student::new;

        Student student = studentCreator.apply("Sujan");

        student.display();


        // =====================================================
        // 6. INSTANCE METHOD USING CLASS NAME
        // =====================================================

        Function<String, String> upperCase =
                String::toUpperCase;

        String result = upperCase.apply("hello");

        System.out.println(result);


        // =====================================================
        // 7. PREDICATE
        // =====================================================

        Predicate<Integer> checkAge =
                age -> age >= 18;

        System.out.println(checkAge.test(20));
        System.out.println(checkAge.test(15));
    }
}