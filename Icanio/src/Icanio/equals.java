package Icanio;

public class equals {
    public static void main(String[] args) {
        StringBuilder s1 = "abc";
        StringBuilder s2 = s1;
        s1= "AA";
        System.out.println(s1 == s2);
    }
}
