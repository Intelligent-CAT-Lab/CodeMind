import java.util.HashMap;
import java.util.Scanner;

public class p01916 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        HashMap<Character, Integer> dic = new HashMap<>();
        for (char s : input.toCharArray()) {
            dic.put(s, dic.getOrDefault(s, 0) + 1);
        }
        int ans = 0;
        for (int count : dic.values()) {
            if ((count & 1) == 1) {
                ans += 1;
            }
        }
        System.out.println(ans >> 1);
        scanner.close();
    }
}