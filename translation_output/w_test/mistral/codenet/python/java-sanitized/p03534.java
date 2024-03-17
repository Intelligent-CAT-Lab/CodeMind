import java.util.*;

public class p03534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> dic = new HashMap<>();
        for (char c : s.toCharArray()) {
            dic.put(c, dic.getOrDefault(c, 0) + 1);
        }
        int a = dic.get("a");
        int b = dic.get("b");
        int c = dic.get("c");
        System.out.println("YES".equals(Math.abs(a - b) <= 1 && Math.abs(b - c) <= 1 && Math.abs(c - a) <= 1) ? "YES" : "NO");
    }
}