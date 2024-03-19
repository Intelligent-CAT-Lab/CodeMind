import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03534 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Map<Character, Integer> dic = new HashMap<>();
        dic.put('a', 0);
        dic.put('b', 0);
        dic.put('c', 0);
        for (char c : s.toCharArray()) {
            dic.put(c, dic.get(c) + 1);
        }
        int a = dic.get('a');
        int b = dic.get('b');
        int c = dic.get('c');
        System.out.println(Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a))) <= 1 ? "YES" : "NO");
    }
}