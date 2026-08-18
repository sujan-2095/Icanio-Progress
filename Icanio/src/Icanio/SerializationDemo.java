package Icanio;

import java.io.*;

class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class SerializationDemo {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Sujan");

        // Serialization
        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("student.ser"));

            out.writeObject(s1);
            out.close();

            System.out.println("Object serialized");

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Deserialization
        try {
            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("student.ser"));

            Student s2 = (Student) in.readObject();
            in.close();

            System.out.println("Object deserialized");
            System.out.println(s2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}