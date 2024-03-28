import java.util.HashMap;
import java.util.Scanner;

public class p03687 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        HashMap<Character, Integer> counter = new HashMap<>();
        for(char c : input.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        int minSequenceLength = Integer.MAX_VALUE;
        
        for(char key : counter.keySet()) {
            int j = 0, maxSequence = 0;
            for(char s : input.toCharArray()) {
                if(key == s) {
                    j = 0;
                } else {
                    j++;
                    maxSequence = Math.max(maxSequence, j);
                }
            }
            minSequenceLength = Math.min(minSequenceLength, maxSequence);
        }
        
        System.out.println(minSequenceLength);
    }
}