import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String statement = "people love to love people";
        String[] words = statement.split(" "); // Split the statement into words

        // Create a map to store word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Print the word frequencies
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }

    }
}
