import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] a = input.split(" ");
        List<String> list = Arrays.asList(a);
        
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : list) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        String mostFrequentWord = Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        
        String longestWord = Collections.max(Arrays.asList(a), Comparator.comparingInt(String::length));
        
        System.out.println(mostFrequentWord + " " + longestWord);
    }
}