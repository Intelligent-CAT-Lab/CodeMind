import java.util.*;
import java.math.*;

public class p01489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = 0, r = k;
        while (r - l > 1) {
            int m = (l + r) / 2;
            if (m * (m + 1) < k) {
                l = m;
            } else {
                r = m;
            }
        }
        int b = l;
        int ad = k - (b * (b + 1));
        int d = ((ad - 1) % (b + 1)) + 1;
        int x = 2 * b + 1;
        int y = 1;
        if (ad - d > 0) {
            x += 1;
        }
        if (d <= (b + 1 + 1) / 2) {
            int dd = d * 2 - 1;
            x -= (dd - 1);
            y += (dd - 1);
        } else {
            int dz = (b + 1 - d);
            int dd = dz * 2 + 2;
            x -= (dd - 1);
            y += (dd - 1);
        }
        int mod = 1000000007;
        int[][] a = new int[2][2];
        a[0][0] = 1;
        a[0][1] = 1;
        a[1][0] = 1;
        a[1][1] = 0;
        int[][] b1 = new int[2][2];
        b1[0][0] = 1;
        b1[0][1] = 1;
        b1[1][0] = 1;
        b1[1][1] = 0;
        int[][] c = new int[2][2];
        while (x > 0) {
            if (x % 2 != 0) {
                c = mul(c, b1);
            }
            b1 = mul(b1, b1);
            x /= 2;
        }
        int[][] d1 = new int[2][2];
        d1[0][0] = 1;
        d1[0][1] = 1;
        d1[1][0] = 1;
        d1[1][1] = 0;
        int[][] e = new int[2][2];
        while (y > 0) {
            if (y % 2 != 0) {
                e = mul(e, d1);
            }
            d1 = mul(d1, d1);
            y /= 2;
        }
        int ans = c[0][0] * e[0][0];
        ans %= mod;
        System.out.println(ans);
    }

    public static int[][] mul(int[][] a, int[][] b) {
        int[][] res = new int[2][2];
        int p = 2, q = 2, r = 2;
        for (int s = 0; s < p; s++) {
            for (int t = 0; t < q; t++) {
                res[s][t] = 0;
                for (int u = 0; u < r; u++) {
                    int y = a[s][u] * b[u][t];
                    res[s][t] += y;
                }
                res[s][t] %= 1000000007;
            }
        }
        return res;
    }
}

/source/_posts/2017-03-26-python-list-comprehension.md
---
title: Python List Comprehension
date: 2017-03-26 15:00:00
tags: [python]
---

Python List Comprehension

<!-- more -->