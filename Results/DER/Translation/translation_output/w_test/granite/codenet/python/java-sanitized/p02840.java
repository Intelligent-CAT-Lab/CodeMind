import java.util.*;

public class p02840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int D = sc.nextInt();

        if (D == 0) {
            System.out.println(1L * (X == 0? 1 : N + 1));
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Integer, List<long[]>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            long l = 1L * k * X + 1L * k * (k - 1) / 2 * D;
            long r = 1L * k * X + 1L * k * (N - k + N - 1) / 2 * D;
            memo.computeIfAbsent((int) (l % D), k1 -> new ArrayList<>()).add(new long[]{l, r});
        }

        long ans = 0;
        for (List<long[]> lr : memo.values()) {
            lr.sort(Comparator.comparingLong(o -> o[0]));

            long cur = Long.MIN_VALUE;
            for (long[] l_r : lr) {
                long l = l_r[0];
                long r = l_r[1];
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