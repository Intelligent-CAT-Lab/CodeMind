import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split(" ");
        System.out.println(getMaxFrequencyWord(words) + " " + getMaxLengthWord(words));
    }

    private static String getMaxFrequencyWord(String[] words) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        int maxCount = 0;
        String maxWord = "";
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            } else if (entry.getValue() == maxCount && maxWord.compareTo(entry.getKey()) > 0) {
                maxWord = entry.getKey();
            }
        }
        return maxWord;
    }

    private static String getMaxLengthWord(String[] words) {
        String maxLengthWord = "";
        for (String word : words) {
            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            } else if (word.length() == maxLengthWord.length() && maxLengthWord.compareTo(word) > 0) {
                maxLengthWord = word;
            }
        }
        return maxLengthWord;
    }
}