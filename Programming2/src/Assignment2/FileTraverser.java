package Assignment2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileTraverser {

	public static List<File> getJavaFiles(String directoryPath) {
        List<File> javaFiles = new ArrayList<>();
        File directory = new File(directoryPath);
        
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                if (file.isFile() && file.getName().endsWith(".java")) {
                    javaFiles.add(file);
                }
            }
        } else {
            System.out.println("Provided path is not a directory");
        }
        return javaFiles;
    }
    
    public static void main(String[] args) {
        String dirPath = "https://github.com/Asia98M/Assignment2OfAsiaAndDominique.git";
        List<File> javaFiles = getJavaFiles(dirPath);
        
        System.out.println("Found Java Files:");
        for (File file : javaFiles) {
            System.out.println(file.getName());
        }
    }
}