import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class p02840 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int D = scanner.nextInt();

        if (D == 0) {
            System.out.println(1);
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Integer, List<Integer>> memo = new HashMap<>();
        for (int k = 1; k <= N; k++) {
            int l = k * X + (k - 1) * k / 2 * D;
            int r = k * X + (N - k + N - 1) * k / 2 * D;
            memo.put(l % D, new ArrayList<>());
            memo.get(l % D).add(l);
            memo.get(l % D).add(r);
        }

        int ans = 0;
        for (List<Integer> LR : memo.values()) {
            LR.sort(Integer::compareTo);

            int cur = -1000000000;
            for (int i = 0; i < LR.size(); i++) {
                int l = LR.get(i);
                int r = LR.get(i + 1);
                if (cur < l) {
                    ans += (r - l) / D + 1;
                    cur = r;
                }
                if (cur < r) {
                    ans += (r - cur) / D;
                    cur = r;
                }
            }
        }

        System.out.println(ans);
    }
}