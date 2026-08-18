package Icanio;

import java.io.*;
import java.nio.file.*;

public class BufferedIODemo {

    public static void main(String[] args) throws IOException {

        Path input = Paths.get("largefile.txt");
        Path output = Paths.get("copy.txt");

        // Create sample input file
        Files.writeString(input,
                "Sujan - Java\n" +
                "Rahul - Python\n" +
                "Anu - React\n");

        // Read and write line by line
        try (
            BufferedReader reader = Files.newBufferedReader(input);
            BufferedWriter writer = Files.newBufferedWriter(output)
        ) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);

                writer.write(line);
                writer.newLine();
            }
        }

        System.out.println("File copied successfully.");
        System.out.println("Input: " + input.toAbsolutePath());
        System.out.println("Output: " + output.toAbsolutePath());
    }
}