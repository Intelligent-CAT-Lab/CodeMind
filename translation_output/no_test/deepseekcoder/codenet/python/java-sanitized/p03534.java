import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03534 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 0);
        map.put('c', 0);
        for (char c : s.toCharArray()) {
            map.put(c, map.get(c) + 1);
        }
        int a = map.get('a');
        int b = map.get('b');
        int c = map.get('c');
        System.out.println(Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a))) <= 1 ? "YES" : "NO");
    }
}