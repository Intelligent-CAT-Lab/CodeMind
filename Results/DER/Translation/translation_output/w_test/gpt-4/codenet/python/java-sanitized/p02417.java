import java.util.HashMap;
import java.util.Scanner;

public class p02417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (char ch : line.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char lowerCh = Character.toLowerCase(ch);
                    frequencyMap.put(lowerCh, frequencyMap.getOrDefault(lowerCh, 0) + 1);
                }
            }
        }
        
        scanner.close();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.printf("%c : %d%n", ch, frequencyMap.getOrDefault(ch, 0));
        }
    }
}