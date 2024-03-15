import java.util.HashMap;
import java.util.Map;

public class p00957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();

        Map<Integer, Integer> memo = new HashMap<>();

        int ans = rec(0, true, l, k, memo);
        System.out.println(ans);
    }

    public static int rec(int i, boolean isBlack, int l, int k, Map<Integer, Integer> memo) {
        if (i < 0) {
            return 0;
        }
        if (i == 0) {
            return isBlack ? 1 : 0;
        }
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        int ans = 0;
        if (isBlack) {
            ans = rec(i - 1, false, l, k, memo) + rec(i - k, false, l, k, memo);
        } else {
            ans = rec(i - 1, true, l, k, memo) + rec(i - k, true, l, k, memo);
        }
        memo.put(i, ans);
        return ans;
    }
}