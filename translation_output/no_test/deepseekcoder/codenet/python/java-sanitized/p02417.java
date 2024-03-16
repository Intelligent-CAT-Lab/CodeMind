import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02417 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            for (char c : s.toCharArray()) {
                if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                    char lowerCase = Character.toLowerCase(c);
                    map.put(lowerCase, map.getOrDefault(lowerCase, 0) + 1);
                }
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + ": " + map.getOrDefault(c, 0) + "\n");
        }
    }
}