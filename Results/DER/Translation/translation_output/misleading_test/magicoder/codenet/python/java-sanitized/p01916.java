import java.util.*;

public class p01916 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = 0;
        for (int value : map.values()) {
            if ((value & 1) == 1) {
                ans++;
            }
        }
        System.out.println(ans >> 1);
    }
}