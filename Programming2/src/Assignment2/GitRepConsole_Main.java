package Assignment2;

import java.io.File;
import java.util.List;


public class GitRepConsole_Main {

    public static void main(String[] args) {
        String dirPath = "https://github.com/Asia98M/Assignment2OfAsiaAndDominique.git";
        List<File> javaFiles = FileTraverser.getJavaFiles(dirPath);

        if (javaFiles.isEmpty()) {
            System.out.println("No Java files found.");
            return;
        }

        float[][] matrix = SimilarityMatrix.computeSimilarityMatrix(javaFiles);

        // Find the three highest and lowest similarities
        List<Float> extremes = MatrixAnalyzer.findExtremes(matrix, 3);
    }
}