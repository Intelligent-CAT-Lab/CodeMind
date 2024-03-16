import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input and splitting into an array
        String[] a = scanner.nextLine().split(" ");
        
        // Finding the element with the highest frequency
        String mostFrequentElement = null;
        int mostFrequency = 0;
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String element : a) {
            int frequency = frequencyMap.getOrDefault(element, 0) + 1;
            frequencyMap.put(element, frequency);
            
            if (frequency > mostFrequency) {
                mostFrequentElement = element;
                mostFrequency = frequency;
            } else if (frequency == mostFrequency && mostFrequentElement != null 
                    && element.compareTo(mostFrequentElement) < 0) {
                // Tie-breaker: choose the lexicographically smaller element
                mostFrequentElement = element;
            }
        }
        
        // Finding the longest element
        String longestElement = Arrays.stream(a)
                                  .max((e1, e2) -> Integer.compare(e