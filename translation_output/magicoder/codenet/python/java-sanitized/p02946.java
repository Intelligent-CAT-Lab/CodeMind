import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static final long DVSR = 1000000007;
    static final long INTMAX = Long.MAX_VALUE;
    static final long INTMIN = Long.MIN_VALUE;

    static long POW(long x, long y) {
        return (long) Math.pow(x, y) % DVSR;
    }

    static long INV(long x, long m) {
        return POW(x, m - 2);
    }

    static long DIV(long x, long y, long m) {
        return (x * INV(y, m)) % m;
    }

    static long[] LI() {
        String[] str = new Scanner(System.in).nextLine().split(" ");
        long[] res = new long[str.length];
        for (int i = 0; i < str.length; i++) {
            res[i] = Long.parseLong(str[i]);
        }
        return res;
    }

    static long[] LF() {
        String[] str = new Scanner(System.in).nextLine().split(" ");
        long[] res = new long[str.length];
        for (int i = 0; i < str.length; i++) {
            res[i] = Double.valueOf(str[i]).longValue();
        }
        return res;
    }

    static String[] LS() {
        return new Scanner(System.in).nextLine().split(" ");
    }

    static long II() {
        return new Scanner(System.in).nextLong();
    }

    static long[] FLIST(int n) {
        long[] res = new long[n + 1];
        res[0] = 1;
        for (int i = 1; i <= n; i++) {
            res[i] = (res[i - 1] * i) % DVSR;
        }
        return res;
    }

    static long gcd(long x, long y) {
        if (x < y) {
            long temp = x;
            x = y;
            y = temp;
        }
        long div = x % y;
        while (div != 0) {
            x = y;
            y = div;
            div = x % y;
        }
        return y;
    }

    public static void main(String[] args) {
        long[] input = LI();
        long K = input[0];
        long X = input[1];

        for (long i = Math.max(X - K + 1, -1000000); i <= Math.min(X + K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}