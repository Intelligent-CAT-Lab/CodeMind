import java.util.*;

public class p02840 {
    static final long INF = Long.MAX_VALUE;

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

        Map<Integer, List<long[]>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            long l = k * X + (k - 1L) * k / 2 * D;
            long r = k * X + (N - k + N - 1L) * k / 2 * D;
            memo.computeIfAbsent( (int) (l % D), k1 -> new ArrayList<>()).add(new long[]{l, r});
        }

        long ans = 0;
        for (List<long[]> LR : memo.values()) {
            LR.sort(Comparator.comparingLong(a -> a[0]));

            long cur = -INF;
            for (long[] lr : LR) {
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