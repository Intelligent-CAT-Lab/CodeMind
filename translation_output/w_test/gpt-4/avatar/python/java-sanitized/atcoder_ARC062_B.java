import java.util.Scanner;
import java.util.HashMap;

public class atcoder_ARC062_B {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        scanner.useDelimiter("\\s"); // To handle inputs separated by any whitespace
        resolve();
    }
    
    private static void resolve() {
        String S = scanner.nextLine().replace(" ", ""); // Remove all whitespaces
        HashMap<Character, Integer> characterCounts = countCharacters(S);
        int result = (characterCounts.getOrDefault('g', 0) - characterCounts.getOrDefault('p', 0)) / 2;
        System.out.println(result); 
    }

    private static HashMap<Character, Integer> countCharacters(String input) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char ch : input.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        return counts;
    }
}