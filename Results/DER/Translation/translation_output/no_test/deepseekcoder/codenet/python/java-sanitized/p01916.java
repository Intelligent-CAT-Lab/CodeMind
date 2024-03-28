import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p01916 {
    public static void main(String[] args) {
        Map<Character, Integer> dic = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        for (char s : S.toCharArray()) {
            dic.put(s, dic.getOrDefault(s, 0) + 1);
        }
        int ans = 0;
        for (char k : dic.keySet()) {
            if ((dic.get(k) & 1) == 1) ans += 1;
        }
        System.out.println(ans >> 1);
    }
}