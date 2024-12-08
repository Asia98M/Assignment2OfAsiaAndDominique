package Assignment2;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileSummariser {

	    public static Map<String, Integer> summarizeFiles(List<File> files) {
	        Map<String, Integer> summary = new HashMap<>();
	        summary.put("TotalFiles", files.size());
	        summary.put("JavaFiles", (int) files.stream().filter(f -> f.getName().endsWith(".java")).count());
	        return summary;
	    }
	}