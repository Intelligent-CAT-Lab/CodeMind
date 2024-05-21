import java.util.*;

public class p02840 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int D = scanner.nextInt();

        if (D == 0) {
            System.out.println(1 + (X == 0 ? 0 : N + 1));
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Integer, List<int[]>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            int l = k * X + (k - 1) * k / 2 * D;
            int r = k * X + (N - k + N - 1) * k / 2 * D;
            memo.computeIfAbsent(l % D, k1 -> new ArrayList<>()).add(new int[]{l, r});
        }

        int ans = 0;
        for (List<int[]> LR : memo.values()) {
            Collections.sort(LR, Comparator.comparingInt(a -> a[0]));

            int cur = Integer.MIN_VALUE;
            for (int[] lr : LR) {
                if (cur < lr[0]) {
                    ans += (lr[1] - lr[0]) / D + 1;
                    cur = lr[1];
                }
                if (cur < lr[1]) {
                    ans += (lr[1] - cur) / D;
                    cur = lr[1];
                }
            }
        }

        System.out.println(ans);
    }
}