import java.util.*;

public class p01916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Map<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!dic.containsKey(c)) dic.put(c, 1);
            else dic.put(c, dic.get(c) + 1);
        }
        int ans = 0;
        for (char c : dic.keySet()) {
            if (dic.get(c) % 2!= 0) ans++;
        }
        System.out.println(ans/2);
    }
}