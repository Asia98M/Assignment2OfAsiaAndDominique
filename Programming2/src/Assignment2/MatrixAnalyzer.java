package Assignment2;

import java.util.*;

public class MatrixAnalyzer {

    public static List<Float> findExtremes(float[][] matrix, int count) {
        List<Float> values = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i != j) { // Exclude diagonal
                    values.add(matrix[i][j]);
                }
            }
        }

        values.sort(Collections.reverseOrder()); 
        List<Float> highest = values.subList(0, Math.min(count, values.size()));
        values.sort(null); 
        List<Float> lowest = values.subList(0, Math.min(count, values.size()));

        System.out.println("Highest Similarities: " + highest);
        System.out.println("Lowest Similarities: " + lowest);

        List<Float> extremes = new ArrayList<>();
        extremes.addAll(highest);
        extremes.addAll(lowest);
        return extremes;
    }
}