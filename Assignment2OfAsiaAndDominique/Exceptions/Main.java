package exceptions;

import java.io.File;
import java.util.List;

//Usage
public class Main {
public static void main(String[] args) {
 DirectoryProcessor processor = new DirectoryProcessor();
 try {
     List<File> files = processor.getJavaFiles("some/invalid/path");
     System.out.println("Found " + files.size() + " Java files");
 } catch (DirectoryNotFoundException e) {
     System.err.println("Error: " + e.getMessage());
 }
}
}