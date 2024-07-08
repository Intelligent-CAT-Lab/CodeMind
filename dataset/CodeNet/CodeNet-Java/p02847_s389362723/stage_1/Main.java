import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner sc    = new Scanner(System.in);
    static final int     MOD   = (int) 1E9 + 7;
    static final long    INF_L = (long) 4E18;
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList("SUN","MON","TUE","WED","THU","FRI","SAT");
        String s = nstr();
        System.out.println(7 - list.indexOf(s));
    }
        

    @Deprecated
    static int nint() {
var newVariable_0 = sc.nextInt();        return newVariable_0;
    }

    @Deprecated
    static int[] nints(int N) {
        return nints(0, N, 0);
    }

    @Deprecated
    private static int[] nints(int padL, int N, int padR) {
        int[] a = new int[padL + N + padR];
        for (int i = 0; i < N; i++)
            a[padL + i] = nint();
        return a;
    }

    static long nlong() {
var newVariable_1 = sc.nextLong();        return newVariable_1;
    }

    static long[] nlongs(int N) {
        return nlongs(0, N, 0);
    }

    static long[] nlongs(int padL, int N, int padR) {
        long[] a = new long[padL + N + padR];
        for (int i = 0; i < N; i++)
            a[padL + i] = nlong();
        return a;
    }

    static double ndouble() {
var newVariable_2 = sc.nextDouble();        return newVariable_2;
    }

    static double[] ndoubles(int N) {
        return ndoubles(0, N, 0);
    }

    static double[] ndoubles(int padL, int N, int padR) {
        double[] d = new double[N + padL + padR];
        for (int i = 0; i < N; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    static String nstr() {
var newVariable_3 = sc.next();        return newVariable_3;
    }

    static char[] nchars() {
var newVariable_4 = sc.next().toCharArray();var newVariable_5 = sc.next();        return newVariable_5.toCharArray();
    }

    static char[] nchars(int padL, int padR) {
var newVariable_6 = sc.next();        char[] temp = newVariable_6.toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }

    static char[][] nchars2(int H, int W) {
        return nchars2(H, W, 0, 0);
    }

    static char[][] nchars2(int H, int W, int padLU, int padRD) {
        char[][] a2 = new char[H + padLU + padRD][W + padLU + padRD];
        for (int i = 0; i < H; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, W);
        return a2;
    }

    static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }

    static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }

    static long abs(long a) {
        return Math.abs(a);
    }
}
