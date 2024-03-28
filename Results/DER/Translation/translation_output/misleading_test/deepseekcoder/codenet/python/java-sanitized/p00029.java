import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String maxCountWord = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();

        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords = new ArrayList<>();
                longestWords.add(word);
            } else if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        System.out.println(longestWords.contains(maxCountWord) ? maxCountWord : longestWords.get(0));
    }
}