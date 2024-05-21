import java.io.*;
import java.util.*;

public class p03629 {
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter pw = new PrintWriter(System.out);
    
    public static void main(String[] args) throws Exception {
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int[][] next = new int[n][26];
        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < 26; j++) {
                if(i == n-1) {
                    next[i][j] = (s[i] - 'a' == j)? n : i+1;
                } else {
                    next[i][j] = next[i+1][j];
                    if(s[i] - 'a' == j) {
                        next[i][j] = i;
                    }
                }
            }
        }
        int[] dp = new int[n+1];
        int[] prev = new int[n+1];
        Arrays.fill(dp,n+1);
        dp[n] = 0;
        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < 26; j++) {
                int to = next[i][j];
                if(dp[to+1] + 1 < dp[i]) {
                    dp[i] = dp[to+1] + 1;
                    prev[i] = j;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int now = 0;
        while(now < n) {
            sb.append((char)('a' + prev[now]));
            now = next[now][prev[now]] + 1;
        }
        pw.println(sb.toString());
        pw.flush();
    }

    static void put(int[] arr, int idx, int val) {
        if(idx < 0 || idx >= arr.length) return;
        arr[idx] = val;
    }

    static void put(long[] arr, int idx, long val) {
        if(idx < 0 || idx >= arr.length) return;
        arr[idx] = val;
    }

    static void put(double[] arr, int idx, double val) {
        if(idx < 0 || idx >= arr.length) return;
        arr[idx] = val;
    }

    static void put(boolean[] arr, int idx, boolean val) {
        if(idx < 0 || idx >= arr.length) return;
        arr[idx] = val;
    }

    static void put(char[] arr, int idx, char val) {
        if(idx < 0 || idx >= arr.length) return;
        arr[idx] = val;
    }

    static void put(int[][] arr, int i, int j, int val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        arr[i][j] = val;
    }

    static void put(long[][] arr, int i, int j, long val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        arr[i][j] = val;
    }

    static void put(double[][] arr, int i, int j, double val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        arr[i][j] = val;
    }

    static void put(char[][] arr, int i, int j, char val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        arr[i][j] = val;
    }

    static void put(int[][][] arr, int i, int j, int k, int val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        arr[i][j][k] = val;
    }

    static void put(long[][][] arr, int i, int j, int k, long val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        arr[i][j][k] = val;
    }

    static void put(double[][][] arr, int i, int j, int k, double val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        arr[i][j][k] = val;
    }

    static void put(char[][][] arr, int i, int j, int k, char val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        arr[i][j][k] = val;
    }

    static void put(int[][][][] arr, int i, int j, int k, int l, int val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        if(l < 0 || l >= arr[0][0][0].length) return;
        arr[i][j][k][l] = val;
    }

    static void put(long[][][][] arr, int i, int j, int k, int l, long val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        if(l < 0 || l >= arr[0][0][0].length) return;
        arr[i][j][k][l] = val;
    }

    static void put(double[][][][] arr, int i, int j, int k, int l, double val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        if(l < 0 || l >= arr[0][0][0].length) return;
        arr[i][j][k][l] = val;
    }

    static void put(char[][][][] arr, int i, int j, int k, int l, char val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        if(l < 0 || l >= arr[0][0][0].length) return;
        arr[i][j][k][l] = val;
    }

    static <T> void fill(T[][] arr, T val) {
        for(int i = 0; i < arr.length; i++) Arrays.fill(arr[i], val);
    }

    static <T> void fill(T[][][] arr, T val) {
        for(int i = 0; i < arr.length; i++) fill(arr[i], val);
    }

    static <T> void fill(T[][][][] arr, T val) {
        for(int i = 0; i < arr.length; i++) fill(arr[i], val);
    }

    static <T> void fill(T[][][][][] arr, T val) {
        for(int i = 0; i < arr.length; i++) fill(arr[i], val);
    }

    static class FastScanner {
        private InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        public FastScanner(InputStream in) {this.in = in;}
        private boolean hasNextByte() {
            if(ptr < buflen) return true;
            ptr = 0;
            try {buflen = in.read(buffer);}
            catch (final IOException e) {e.printStackTrace();}
            return buflen > 0;
        }
        private int readByte() {return hasNextByte()? buffer[ptr++] : -1;}