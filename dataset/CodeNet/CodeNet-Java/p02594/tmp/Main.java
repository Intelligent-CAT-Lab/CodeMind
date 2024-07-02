//package com.atcoder.contest174.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int x = fs.nextInt();
        if(x >= 30) System.out.println("Yes");
        else System.out.println("No");
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
System.out.println("[INST]20;None;st.hasMoreTokens();"+st.hasMoreTokens());
                try {
                    st = new StringTokenizer(br.readLine());
System.out.println("[INST]22;None;br.readLine();"+br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
System.out.println("[INST]26;None;st.nextToken();"+st.nextToken());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
