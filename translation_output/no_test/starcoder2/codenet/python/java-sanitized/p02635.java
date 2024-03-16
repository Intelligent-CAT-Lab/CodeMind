import java.util.*;

public class p02635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        K = Math.min(K, 300);
        int mod = 998244353;
        int[] a = new int[S.length()];
        int val = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                a[val] = i;
                val = 0;
            } else {
                val++;
            }
        }
        if (val != 0) {
            a[val] = S.length();
        }
        int m = a.length;
        K = Math.min(Arrays.stream(a).sum(), K);
        int[][][] dp = new int[m + 1][K + 1][K + 1];
        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }
        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = a[i];
        }
        for (int i = m - 2; i >= 0; i--) {
            c[i] = a[i];
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int k = 0; k <= Math.min(Arrays.stream(b).sum(), K); k++) {
                for (int j = 0; j <= Math.min(K, k + Arrays.stream(c).sum()); j++) {
                    int M = Math.max(k - j, -a[i]);
                    for (int l = Math.max(0, M); l <= K - j; l++) {
                        dp[i][j][k] += dp[i + 1][j + l][k];
                        dp[i][j][k] %= mod;
                    }
                    for (int l = 1; l <= Math.min(K - k, -M); l++) {
                        dp[i][j][k] += dp[i + 1][j][k + l];
                        dp[i][j][k] %= mod;
                    }
                }
            }
        }
        System.out.println(dp[0][0][0]);
    }
}

/content/posts/2020-04-26-leetcode-100.md
---
title: LeetCode 100. Same Tree
date: 2020-04-26 15:00:00
tags: [LeetCode, DFS]
---