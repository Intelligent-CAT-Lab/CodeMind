import java.util.*;

public class p02840 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int D = scanner.nextInt();

        if (D == 0) {
            System.out.println(X == 0 ? 1 : N + 1);
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Integer, List<int[]>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            int l = k * X + (k * (k - 1) / 2) * D;
            int r = k * X + (N * k + (N - k) * (N - k + 1) / 2) * D;
            memo.computeIfAbsent(l % D, x -> new ArrayList<>()).add(new int[]{l, r});
        }

        int ans = 0;
        for (List<int[]> LR : memo.values()) {
            LR.sort(Comparator.comparingInt(a -> a[0]));

            int cur = Integer.MIN_VALUE;
            for (int[] interval : LR) {
                if (cur < interval[0]) {
                    ans += (interval[1] - interval[0]) / D + 1;
                    cur = interval[1];
                }
                if (cur < interval[1]) {
                    ans += (interval[1] - cur) / D;
                    cur = interval[1];
                }
            }
        }

        System.out.println(ans);
    }
}