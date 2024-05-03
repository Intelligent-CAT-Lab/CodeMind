import java.util.HashMap;
import java.util.Map;

public class p00957 {
    private static Map<String, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        String[] input = System.console().readLine().split(" ");
        int l = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true);
        }

        System.out.println(ans);
    }

    @lru_cache()
    public static int rec(int i, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;  // black at bottom
        if (isBlack) { // top is black
            return rec(i - 1, false) + rec(i - k, false);
        } else {  // top is white
            return rec(i - 1, true);
        }
    }
}