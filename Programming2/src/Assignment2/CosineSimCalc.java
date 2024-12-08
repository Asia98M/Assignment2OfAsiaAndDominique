package Assignment2;

import java.util.Map;

public class CosineSimCalc {
	
	private static double calculateDotProduct(Map<String, Integer> vec1, Map<String, Integer> vec2) {
        double dotProduct = 0.0;
        for (String key : vec1.keySet()) {
            dotProduct += vec1.getOrDefault(key, 0) * vec2.getOrDefault(key, 0);
        }
        return dotProduct;
    }

    private static double calculateMagnitude(Map<String, Integer> vec) {
        return Math.sqrt(vec.values().stream().mapToDouble(v -> v * v).sum());
    }

    public static double computeCosineSimilarity(Map<String, Integer> vec1, Map<String, Integer> vec2) {
        double dotProduct = calculateDotProduct(vec1, vec2);
        double magnitude1 = calculateMagnitude(vec1);
        double magnitude2 = calculateMagnitude(vec2);

        return (magnitude1 == 0 || magnitude2 == 0) ? 0.0 : dotProduct / (magnitude1 * magnitude2);
    }
}
