//package com.company;

import java.io.*;
import java.util.*;


public class Main {
    public static class Task {
        int mod = 998244353;
        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            char[] cc = sc.next().toCharArray();
            int n = cc.length;
            int r = 0, b = 0;
            long[][] dp = new long[n + 1][n + 1];
            dp[0][0] = 1;
            for (int i = 0; i < n; i++) {
                if (cc[i] == '0') {
                    r += 2;
                } else if (cc[i] == '1') {
                    r += 1;
                    b += 1;
                } else {
                    b += 2;
                }
                for (int prevUseRed = 0; prevUseRed <= i; prevUseRed++) {
                    if (prevUseRed + 1 <= r) {
                        dp[i + 1][prevUseRed + 1] += dp[i][prevUseRed];
                        dp[i + 1][prevUseRed + 1] %= mod;
                    }
                    int prevUseBlue = i - prevUseRed;
                    if (prevUseBlue + 1 <= b) {
                        dp[i + 1][prevUseRed] += dp[i][prevUseRed];
                        dp[i + 1][prevUseRed] %= mod;
                    }
                }
            }
            long[][] combin = new long[n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                combin[i][0] = combin[i][i] = 1;
            }
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j]) % mod;
                }
            }
            long tto = 0;
            for (int i = 0; i <= Math.min(r, n); i++) {
                long ways = dp[n][i];
                int lr = r - i;
                int lb = b - (n - i);
                if (lb < 0) continue;
                ways *= combin[n][lr];
                ways %= mod;
                tto = (tto + ways) % mod;
            }
            pw.println(tto);

        }

    }

    private static long TIME_START, TIME_END;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("23.in"));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("froggy.out"));


//        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.in"));
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
        System.out.println("Memory increased:" + (usedMemoryAfter-usedMemoryBefore) / 1000000 );
        System.out.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){  br = new BufferedReader(new InputStreamReader(s));}

        public Scanner(FileReader s) throws FileNotFoundException {br = new BufferedReader(s);}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException { return Double.parseDouble(next()); }

        public boolean ready() throws IOException {return br.ready();}
    }
}