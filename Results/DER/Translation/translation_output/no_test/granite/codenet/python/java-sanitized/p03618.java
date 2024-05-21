import java.util.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        long res = chars.length * (chars.length - 1) / 2 + 1;
        for (int value : map.values()) {
            res -= value * (value - 1) / 2;
        }
        System.out.println(res);
    }
}