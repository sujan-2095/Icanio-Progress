package com.trial;

public class movetoright {

    static void start(){
        System.out.println("start");
    }

    public static void main(String[] args) {
        start();
        String s = "Sujan";
        Character ch = s.charAt(0);
        String s1 = new String();
        for(int i=0;i<s.length();i++)
        {
            s1 += s.charAt(i);
        }
        s = s + " Hi";
        System.out.println(s);
    }
}
