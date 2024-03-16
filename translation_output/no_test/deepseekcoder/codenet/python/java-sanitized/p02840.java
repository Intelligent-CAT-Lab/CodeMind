import java.util.*;

public class p02840 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int D = in.nextInt();

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
            long l = k * X + (k * (k - 1) / 2) * D;
            long r = k * X + ((N - k + N) * k / 2) * D;
            memo.computeIfAbsent(l % D, x -> new ArrayList<>()).add(new long[]{l, r});
        }

        long ans = 0;
        for (List<long[]> LR : memo.values()) {
            LR.sort(Comparator.comparingLong(a -> a[0]));

            long cur = Long.MIN_VALUE;
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