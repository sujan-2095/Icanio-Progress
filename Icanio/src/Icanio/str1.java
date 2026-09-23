package Icanio;

public class str1 {
    public static void main(String[] args) {
        String str = new String();
        str="Hello";
        System.out.println(str.getBytes());
        str.concat("Hello");
        System.out.println(str.getBytes()); 
    }
}
