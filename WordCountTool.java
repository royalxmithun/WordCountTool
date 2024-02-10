package Wct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountTool {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the text
        System.out.println("Enter some text:");
        
        // Read the text input from the keyboard
        String text = scanner.nextLine();
        
        // Close the scanner to release system resources
        scanner.close();
        
        // Call the countWords method to count words in the input text
        Map<String, Integer> wordCount = countWords(text);
        
        // Print the word count
        System.out.println("Word count:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Split the text into words using whitespace as delimiter
        String[] words = text.split("\\s+");
        
        // Count occurrences of each word
        for (String word : words) {
            // Remove punctuation marks (optional, depends on requirements)
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        return wordCount;
    }
}
