import java.util.*;
import java.lang.*;

class Main {
    static final int inf = (int) 1e20;
    static final double eps = 1e-13;
    static final int mod = (int) 1e9 + 7;
    static final int[][] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static final int[][] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    static int[] LI() {
        String[] s = S().split(" ");
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        return a;
    }

    static int[] LI_() {
        String[] s = S().split(" ");
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]) - 1;
        }
        return a;
    }

    static double[] LF() {
        String[] s = S().split(" ");
        double[] a = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Double.parseDouble(s[i]);
        }
        return a;
    }

    static String[] LS() {
        return S().split(" ");
    }

    static int I() {
        return Integer.parseInt(S());
    }

    static double F() {
        return Double.parseDouble(S());
    }

    static String S() {
        return new Scanner(System.in).nextLine();
    }

    static void pf(String s) {