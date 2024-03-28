import java.util.*;

public class p00957 {
    static int l, k;
    static HashMap<String, Integer> memo = new HashMap<>();

    static int rec(int i, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        String key = i + " " + isBlack;
        if (memo.containsKey(key)) return memo.get(key);
        if (isBlack) {
            int res = rec(i - 1, false) + rec(i - k, false);
            memo.put(key, res);
            return res;
        } else {
            int res = rec(i - 1, true) + rec(i - k, true);
            memo.put(key, res);
            return res;
        }
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