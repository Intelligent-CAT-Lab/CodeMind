import java.util.HashMap;
import java.util.Map;

public class p01916 {
    public static void main(String[] args) {
        Map<Character, Integer> dic = new HashMap<>();
        String S = java.util.Scanner.in.nextLine();
        for (char s : S.toCharArray()) {
            if (!dic.containsKey(s)) {
                dic.put(s, 1);
            } else {
                dic.put(s, dic.get(s) + 1);
            }
        }
        int ans = 0;
        for (char k : dic.keySet()) {
            if (dic.get(k) % 2 != 0) {
                ans += 1;
            }
        }
        System.out.println(ans / 2);
    }
}