//package com.company;
// Always comment out package when submitting.


import java.io.*;
import java.util.*;

public class Main {
    public static class Task {

        long[][] lengthCoef;
        long[][] latsum;
        public void solveForLength(int l) {
            int coefs = l / 2;
            long large = 1;
            long small = 1;
            for (int i = 0; i < l - 1; i++) {
                large *= 10;
            }
            lengthCoef[l] = new long[coefs];
            for (int i = 0; i < coefs; i++) {
                lengthCoef[l][i] = large - small;
                large /= 10;
                small *= 10;
            }
            latsum[l] = new long[coefs];
            if (coefs - 1>=0)
            latsum[l][coefs - 1] = lengthCoef[l][coefs - 1];
            for (int i = coefs - 2; i >= 0; i--) {
                latsum[l][i] = latsum[l][i + 1] + lengthCoef[l][i];
            }
//            System.err.println(Arrays.toString(lengthCoef[l]));
        }
        public long dfs(long[] cfs, long[] lat, int i, long remain) { // [-9, 9]
            if (i == cfs.length ) {
                return remain == 0 ? 1 : 0;
            }
            if (lat[i] * 9 + remain < 0) return 0;
            if (lat[i] * -9 + remain > 0) return 0;
            int cnt = 0;
            for (int j = -9; j < 10; j++) {
                int times = j < 0 ? j + 10: -j + 10;
                if (i == 0) times--;
                cnt += times * dfs(cfs, lat,i + 1, remain + (long) j * cfs[i]);
            }
            return cnt;
        }
        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int sz = 19;
            lengthCoef = new long[sz][];
            latsum = new long[sz][];
            for (int i = 1; i < sz; i++) {
                solveForLength(i);
            }
            int D = sc.nextInt();
            if (D % 9 != 0){
                pw.println(0);
                return;
            }
            int cnt = 0;
            for (int i = 1; i < sz; i++) {
                long t = dfs(lengthCoef[i], latsum[i], 0, D);
                if (i % 2 == 1) t *= i == 1 ? 9 : 10;
                cnt += t;
            }
            pw.println(cnt);
        }
    }

    // template, actual code is in class Task.
    static long TIME_START, TIME_END;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("Test.in"));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.out"));

        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
//        System.err.println("Memory increased: " + (usedMemoryAfter - usedMemoryBefore) / 1000000);
//        System.err.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

    // Faster IO with BufferedReader wrapped with Scanner
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader s) throws FileNotFoundException {
            br = new BufferedReader(s);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}