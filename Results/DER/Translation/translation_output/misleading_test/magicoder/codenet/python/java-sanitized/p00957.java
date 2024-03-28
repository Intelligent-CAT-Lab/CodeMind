import java.util.*;

public class p00957 {
    static int l, k;
    static Map<String, Integer> memo = new HashMap<>();

    static int rec(int i, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        String key = i + " " + isBlack;
        if (memo.containsKey(key)) return memo.get(key);
        int ans;
        if (isBlack) {
            ans = rec(i - 1, false) + rec(i - k, false);
        } else {
            ans = rec(i - 1, true);
        }
        memo.put(key, ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        k = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true);
        }
        System.out.println(ans);
    }
}