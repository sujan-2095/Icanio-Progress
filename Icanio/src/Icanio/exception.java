package Icanio;

class exception{

    static void checkAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) throws Exception{
            try{
                System.out.println("Hello World");
            }
            finally {
                checkAge(18);
        }
    }
}