import java.util.*;

public class p02840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int D = sc.nextInt();

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
            int l = k * X + (k - 1) * k / 2 * D;
            int r = k * X + (N - k + N - 1) * k / 2 * D;
            memo.computeIfAbsent(l % D, z -> new ArrayList<>()).add(new int[]{l, r});
        }

        int ans = 0;
        for (List<int[]> LR : memo.values()) {
            LR.sort(Comparator.comparingInt(a -> a[0]));

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