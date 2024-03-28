import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    char lowerCase = Character.toLowerCase(c);
                    map.put(lowerCase, map.getOrDefault(lowerCase, 0) + 1);
                }
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " : " + map.getOrDefault(c, 0) + "\n");
        }
        scanner.close();
    }
}