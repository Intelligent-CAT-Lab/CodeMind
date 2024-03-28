import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        System.out.println(getMostFrequentWord(words) + " " + getLongestWord(words));
        
        scanner.close();
    }

    public static String getMostFrequentWord(String[] words) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        int maxCount = 0;
        String mostFrequent = "";

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            if (wordCounts.get(word) > maxCount) {
                maxCount = wordCounts.get(word);
                mostFrequent = word;
            }
        }

        return mostFrequent;
    }

    public static String getLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}