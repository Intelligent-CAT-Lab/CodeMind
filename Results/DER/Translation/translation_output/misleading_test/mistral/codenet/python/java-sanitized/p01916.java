import java.util.*;

public class p01916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Map<Character, Integer> dic = new HashMap<>();
        for (char c : S.toCharArray()) {
            if (!dic.containsKey(c)) {
                dic.put(c, 1);
            } else {
                dic.put(c, dic.get(c) + 1);
            }
        }
        int ans = 0;
        for (char c : dic.keySet()) {
            if ((dic.get(c) & 1) == 1) {
                ans++;
            }
        }
        System.out.println(ans >> 1);
    }
}