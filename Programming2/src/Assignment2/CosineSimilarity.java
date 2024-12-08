package Assignment2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CosineSimilarity {

    public static List<String> tokenize(File file) {
        List<String> tokens = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                
                line = line.replaceAll("//.*|/\\*.*?\\*/", "").toLowerCase(); 
                tokens.addAll(Arrays.asList(line.split("\\W+"))); 
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + file.getName());
        }
        return tokens;
    }

    public static Map<String, Integer> buildFrequencyVector(List<String> tokens) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String token : tokens) {
            frequencyMap.put(token, frequencyMap.getOrDefault(token, 0) + 1);
        }
        return frequencyMap;
    }
}