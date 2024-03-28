import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            String inputLine = scanner.nextLine();
            for (char ch : inputLine.toCharArray()) {
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    stringBuilder.append(Character.toLowerCase(ch));
                }
            }
        }
        scanner.close();

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : stringBuilder.toString().toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " : ");
            System.out.println(frequencyMap.getOrDefault(ch, 0));
        }
    }
}