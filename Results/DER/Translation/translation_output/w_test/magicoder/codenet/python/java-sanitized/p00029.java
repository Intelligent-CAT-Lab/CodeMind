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

        String mostFrequentWord = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();

        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords.clear();
                longestWords.add(word);
            } else if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        System.out.println(mostFrequentWord);
        System.out.println(longestWords.get(0));
    }
}