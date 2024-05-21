import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        Map<String, Integer> wordLength = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            wordLength.put(word, word.length());
        }

        String maxCountWord = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        String maxLengthWord = Collections.max(wordLength.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println(maxCountWord + " " + maxLengthWord);
    }
}