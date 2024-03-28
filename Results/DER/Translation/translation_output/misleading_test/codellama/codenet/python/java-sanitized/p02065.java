import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class p02065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mod = scanner.nextInt();
        List<Map<Integer, Integer>> dp = new ArrayList<>();
        for (int i = 0; i < 2 * N; i++) {
            dp.add(new HashMap<>());
        }
        dp.get(0).put(null, 1);
        for (int i = 0; i < 2 * N - 1; i++) {
            for (Map.Entry<Integer, Integer> entry : dp.get(i).entrySet()) {
                int left = entry.getKey();
                int v = entry.getValue();
                if (left == null) {
                    if (dp.get(i + 1).containsKey(i + 1)) {
                        dp.get(i + 1).put(i + 1, (dp.get(i + 1).get(i + 1) + v) % mod);
                    } else {
                        dp.get(i + 1).put(i + 1, v);
                    }
                } else if (i + 1 - left <= K && dp.get(i + 1).containsKey(left)) {
                    dp.get(i + 1).put(left, (dp.get(i + 1).get(left) + v) % mod);
                }
                if (dp.get(i + 1).containsKey(null)) {
                    dp.get(i + 1).put(null, (dp.get(i + 1).get(null) + v) % mod);
                } else {
                    dp.get(i + 1).put(null, v);
                }
            }
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : dp.get(2 * N - 1).entrySet()) {
            int left = entry.getKey();
            int v = entry.getValue();
            if (left == null) {
                res = (res + v) % mod;
            }
        }
        System.out.println(res);
    }
}