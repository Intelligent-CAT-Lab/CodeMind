import java.util.*;

public class p01916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Map<Character, Integer> dic = new HashMap<>();
        for (char s : S.toCharArray()) {
            dic.put(s, dic.getOrDefault(s, 0) + 1);
        }
        int ans = 0;
        for (char k : dic.keySet()) {
            if ((dic.get(k) & 1) == 1) ans++;
        }
        System.out.println(ans >> 1);
    }
}