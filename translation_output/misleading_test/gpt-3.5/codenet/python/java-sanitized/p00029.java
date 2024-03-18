import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        
        Map<String, Integer> countMap = new HashMap<>();
        for(String word : a) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        int maxCount = 0;
        String mostFrequentWord = "";
        for(Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        String longestWord = "";
        for(String word : a) {
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println(mostFrequentWord + " " + longestWord);
    }
}