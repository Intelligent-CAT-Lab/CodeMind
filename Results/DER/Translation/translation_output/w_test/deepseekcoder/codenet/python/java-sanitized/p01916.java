import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p01916 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int ans = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans / 2);
    }
}