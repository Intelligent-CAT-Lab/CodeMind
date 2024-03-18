package com.example;

import java.util.*;

public class p02840 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int D = scanner.nextInt();

        if (D == 0) {
            System.out.println(X == 0 ? 1 : N + 1);
            scanner.close();
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        long INF = Long.MAX_VALUE;
        Map<Integer, List<long[]>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            long l = (long) k * X + (long) (k - 1) * k / 2 * D;
            long r = (long) k * X + (long) (N - k + N - 1) * k / 2 * D;
            memo.computeIfAbsent((int) (l % D), key -> new ArrayList<>()).add(new long[]{l, r});
        }

        long ans = 0;
        for (List<long[]> LR : memo.values()) {
            LR.sort(Comparator.comparingLong(o -> o[0]));

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
        scanner.close();
    }
}