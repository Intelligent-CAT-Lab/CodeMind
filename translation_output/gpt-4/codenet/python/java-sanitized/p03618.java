import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class p03618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Character> sortedCharacters = new ArrayList<>();
        for (char character : s.toCharArray()) {
            sortedCharacters.add(character);
        }
        Collections.sort(sortedCharacters);
        
        // Count frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char character : sortedCharacters) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }
        
        int l = s.length();
        
        // Sum of first (l - 1) natural numbers is l*(l-1)/2
        long res = ((long) l * (l - 1) / 2) + 1;
        
        // Subtract combinations of same character sequences
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int p = entry.getValue();
            res -= ((long) p * (p - 1) / 2);
        }
        System.out.println(res);
        
        scanner.close();
    }
}