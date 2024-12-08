package exceptions;

//Custom Exception
public class DirectoryNotFoundException extends Exception {
 public DirectoryNotFoundException(String message) {
     super(message);
 }
}

//Class that processes directories
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryProcessor {

 public List<File> getJavaFiles(String directoryPath) throws DirectoryNotFoundException {
     File directory = new File(directoryPath);
     if (!directory.exists() || !directory.isDirectory()) {
         throw new DirectoryNotFoundException("Directory does not exist or is not accessible: " + directoryPath);
     }

     List<File> javaFiles = new ArrayList<>();
     collectJavaFiles(directory, javaFiles);
     return javaFiles;
 }

 private void collectJavaFiles(File directory, List<File> javaFiles) {
     for (File file : directory.listFiles()) {
         if (file.isDirectory()) {
             collectJavaFiles(file, javaFiles);
         } else if (file.getName().endsWith(".java")) {
             javaFiles.add(file);
         }
     }
 }
}

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
