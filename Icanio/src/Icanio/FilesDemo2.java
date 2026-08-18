package Icanio;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.util.List;

public class FilesDemo2 {

    public static void main(String[] args) throws IOException {

        Path folder = Paths.get("data");
        Path file1 = folder.resolve("student.txt");
        Path file2 = folder.resolve("student_copy.txt");
        Path file3 = folder.resolve("student_moved.txt");

        // Create folder
        Files.createDirectories(folder);

        // 1. write()
        List<String> students = List.of(
                "Sujan - Java",
                "Rahul - Python",
                "Anu - React"
        );

        Files.write(file1, students);
        System.out.println("File written.");

        // 2. readAllLines()
        List<String> lines = Files.readAllLines(file1);

        System.out.println("\nFile contents:");
        for (String line : lines) {
            System.out.println(line);
        }

        // 3. copy()
        Files.copy(file1, file2, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("\nFile copied.");

        // 4. move()
        Files.move(file2, file3, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved.");

        // 5. walkFileTree()
        System.out.println("\nFiles inside data folder:");

        Files.walkFileTree(folder, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(
                    Path file,
                    BasicFileAttributes attrs) {

                System.out.println(file.toAbsolutePath());

                return FileVisitResult.CONTINUE;
            }
        });
    }
}