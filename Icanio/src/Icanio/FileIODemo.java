package Icanio;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIODemo {

    public static void main(String[] args) throws Exception {

        // Create a Path
        Path path = Paths.get("student.txt");

        // Write to file
        Files.writeString(path, "Name: Sujan\nCourse: Java");

        // Read from file
        String content = Files.readString(path);

        System.out.println("File content:");
        System.out.println(content);

        // Check whether file exists
        System.out.println("File exists: " + Files.exists(path));

        // Get file size
        System.out.println("File size: " + Files.size(path));
        
        //Full path
        System.out.println("Path : " + path.toAbsolutePath());
        
        // Delete file
        Files.delete(path);

        System.out.println("File deleted.");
    }
}