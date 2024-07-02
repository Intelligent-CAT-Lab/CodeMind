import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner sc    = new Scanner(System.in);
    static final int     MOD   = (int) 1E9 + 7;
    static final long    INF_L = (long) 4E18;
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList("SUN","MON","TUE","WED","THU","FRI","SAT");
System.out.println("[INST]10;list;Arrays.asList('SUN','MON','TUE','WED','THU','FRI','SAT');"+list);
        String s = nstr();
        System.out.println(7 - list.indexOf(s));
    }
        

    @Deprecated
    static int nint() {
        return sc.nextInt();
System.out.println("[INST]18;None;sc.nextInt();"+sc.nextInt());
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
        return sc.nextLong();
System.out.println("[INST]35;None;sc.nextLong();"+sc.nextLong());
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
        return sc.nextDouble();
System.out.println("[INST]50;None;sc.nextDouble();"+sc.nextDouble());
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
        return sc.next();
System.out.println("[INST]66;None;sc.next();"+sc.next());
    }

    static char[] nchars() {
        return sc.next().toCharArray();
System.out.println("[INST]70;None;sc.next().toCharArray();"+sc.next().toCharArray());
System.out.println("[INST]70;None;sc.next();"+sc.next());
    }

    static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
System.out.println("[INST]74;temp;sc.next().toCharArray();"+temp);
System.out.println("[INST]74;None;sc.next();"+sc.next());
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
System.out.println("[INST]76;None;System.arraycopy(temp, 0, ret, padL, temp.length);"+System.arraycopy(temp, 0, ret, padL, temp.length));
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
System.out.println("[INST]92;None;Arrays.stream(ls);"+Arrays.stream(ls));
    }

    static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
System.out.println("[INST]96;None;Arrays.stream(ls);"+Arrays.stream(ls));
    }

    static long abs(long a) {
        return Math.abs(a);
    }
}
