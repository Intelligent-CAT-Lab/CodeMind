```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int D = scanner.nextInt();

        final long INF = Long.MAX_VALUE;

        if (D == 0) {
            System.out.println(X == 0 ? 1 : N + 1);
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Long, List<long[]>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            long l = (long) k * X + ((long) k - 1) * k / 2 * D;
            long r = (long) k * X + ((long) N - k + (long) N - 1) * k / 2 * D;
            memo.computeIfAbsent(l % D, x -> new ArrayList<>()).add(new long[]{l, r});
        }

        long ans = 0;
        for (List<long[]> LR : memo.values()) {
            LR.sort(Comparator.comparingLong(a -> a[0]));

            long cur = -INF;
            for (long[] lr : LR) {
                long l = lr[0];
                long r = lr[1];
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
```
