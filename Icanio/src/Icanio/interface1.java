package Icanio;
import java.io.*;

// Interface Declared
interface testInterface {

    // public, static and final
    final int a = 10;

    // public and abstract
    void display();

    default void display2(){
        System.out.println("display");
    }
}

interface testInterface2 {

    default void display2(){
        System.out.println("display");
    }
}

// Class implementing interface
class TestClass implements testInterface, testInterface2 {

    // Implementing the capabilities of Interface
    public void display(){
        System.out.println("Geek");
    }

    @Override
    public void display2() {
        testInterface.super.display2();
    }
}

class interface1{

    public static void main(String[] args){
        try{
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
        t.display2();}
        catch(Exception e){
            System.out.println(e);
        }
    }
}