import java.util.*;
import java.io.*;
import java.math.*;

public class p03365 {
    public static void main(String[] args) {
        Reader f = new Reader(args.length > 0 ? args[0] : null);
        if (f.file != null) {
            while (true) {
                System.out.printf("Case #%d\n", f.caseNum);
                System.out.println(solve(f));
                try {
                    f.nextCase();
                } catch (Exception e) {
                    break;
                }
            }
        } else {
            System.out.println(solve(f));
        }
    }

    static long MOD = 1000000007;

    static long solve(Reader f) {
        int n = f.readInt();

        long[] fact = new long[n+1];
        long[] ifact = new long[n+1];
        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i-1] * i % MOD;
            ifact[i] = pow(fact[i], MOD-2, MOD);
        }

        long nCk(int n, int k) {
            if (k < 0 || k > n) return 0;
            return fact[n] * ifact[n-k] % MOD * ifact[k] % MOD;
        }

        long ans = 0;
        long c0 = 0;
        for (int i = n/2; i < n; i++) {
            long c1 = (nCk(i-1, n-1-i) * fact[i] % MOD * fact[n-i-1] % MOD - c0 + MOD) % MOD;
            ans = (ans + c1 * i) % MOD;
            c0 = (c0 + c1) % MOD;
        }

        return ans;
    }

    static long pow(long a, long b, long mod) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans = ans * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return ans;
    }
}

class Reader {
    BufferedReader file;
    int caseNum = 1;

    Reader(String filename) {
        try {
            file = new BufferedReader(new FileReader(filename));
        } catch (Exception e) {
            file = null;
        }
    }

    void nextCase() throws Exception {
        file.readLine();
        caseNum++;
    }

    String readLine() {
        try {
            return file.readLine();
        } catch (Exception e) {
            return null;
        }
    }

    int readInt() {
        return Integer.parseInt(readLine());
    }

    long readLong() {
        return Long.parseLong(readLine());
    }

    double readDouble() {
        return Double.parseDouble(readLine());
    }

    String[] readStrList() {
        return readLine().split(" ");
    }

    int[] readIntList() {
        String[] strList = readStrList();
        int[] intList = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            intList[i] = Integer.parseInt(strList[i]);
        }
        return intList;
    }

    long[] readLongList() {
        String[] strList = readStrList();
        long[] longList = new long[strList.length];
        for (int i = 0; i < strList.length; i++) {
            longList[i] = Long.parseLong(strList[i]);
        }
        return longList;
    }

    double[] readDoubleList() {
        String[] strList = readStrList();
        double[] doubleList = new double[strList.length];
        for (int i = 0; i < strList.length; i++) {
            doubleList[i] = Double.parseDouble(strList[i]);
        }
        return doubleList;
    }
}

/content/posts/2019-01-01-leetcode-100-same-tree.md
---
title: "Leetcode 100. Same Tree"
date: 2019-01-01T16:00:00+08:00
draft: false
---