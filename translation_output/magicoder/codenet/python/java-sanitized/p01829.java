import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int inf = 1000000000;
    static double eps = 0.000000001;
    static long mod = 998244353;
    static int[][] dd = {{0,-1},{1,0},{0,1},{-1,0}};
    static int[][] ddn = {{0,-1},{1,-1},{1,0},{1,1},{0,1},{-1,-1},{-1,0},{-1,1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = s.length();
        long n = Long.parseLong(s);
        long m = inf;
        String r = "";
        long t = (long)Math.pow(10, l);
        int[] a = new int[l];
        for (int i = 0; i < l; i++) a[i] = i;
        do {
            long b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            long tm = Math.max(Math.abs(n - b), Math.abs(t - Math.abs(n - b)));
            if (m > tm) {
                m = tm;
                StringBuilder sb = new StringBuilder();
                for (int c : a) {
                    sb.append(c);
                }
                r = sb.toString();
            }
        } while (nextPermutation(a));
        System.out.println(r);
    }

    static boolean nextPermutation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;
        if (i < 0) return false;
        int j = a.length - 1;
        while (a[j] <= a[i]) j--;
        swap(a, i, j);
        reverse(a, i + 1, a.length - 1);
        return true;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void reverse(int[] a, int i, int j) {
        while (i < j) swap(a, i++, j--);
    }
}