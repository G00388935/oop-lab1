package ie.atu.oop.week1;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathExplorer {
    public static void main(String[] args)
    {
        Path file = Path.of("Data","books.csv");

        System.out.println("Path " + file);
        System.out.println("File name " + file.getFileName());
        System.out.println("Path: " + file.toAbsolutePath());
        System.out.println("Parent Path: " + file.getParent());
        System.out.println("Exists " + Files.exists(file));
    }
}
