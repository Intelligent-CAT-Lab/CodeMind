import java.util.*;

public class p02840 {
    private static final double INF = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        if (D == 0) {
            System.out.println(X == 0 ? 1 : N + 1);
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Integer, List<Pair>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            int l = k * X + (k - 1) * k / 2 * D;
            int r = k * X + (N - k + N - 1) * k / 2 * D;
            memo.computeIfAbsent(l % D, x -> new ArrayList<>()).add(new Pair(l, r));
        }

        long ans = 0;
        for (List<Pair> LR : memo.values()) {
            LR.sort(Comparator.comparingInt(p -> p.left));

            double cur = -INF;
            for (Pair p : LR) {
                if (cur < p.left) {
                    ans += (p.right - p.left) / D + 1;
                    cur = p.right;
                } else if (cur < p.right) {
                    ans += (p.right - cur) / D;
                    cur = p.right;
                }
            }
        }

        System.out.println(ans);
    }

    static class Pair {
        int left, right;

        Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
}