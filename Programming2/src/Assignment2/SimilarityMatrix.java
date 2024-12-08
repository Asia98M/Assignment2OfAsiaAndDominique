package Assignment2;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SimilarityMatrix {

    public static float[][] computeSimilarityMatrix(List<File> files) {
        int n = files.size();
        float[][] matrix = new float[n][n];

        List<Map<String, Integer>> fileVectors = files.stream()
                .map(file -> CosineSimilarity.buildFrequencyVector(CosineSimilarity.tokenize(file)))
                .collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) { 
                double similarity = CosineSimCalc.computeCosineSimilarity(fileVectors.get(i), fileVectors.get(j));
                matrix[i][j] = (float) similarity;
            }
        }
        return matrix;
    }
}
