import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class p02417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> letterCount = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    letterCount.put(Character.toLowerCase(c), letterCount.getOrDefault(Character.toLowerCase(c), 0) + 1);
                }
            }
        }

        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            System.out.print(c + ": ");
            if (letterCount.containsKey(c)) {
                System.out.println(letterCount.get(c));
            } else {
                System.out.println(0);
            }
        }
    }
}