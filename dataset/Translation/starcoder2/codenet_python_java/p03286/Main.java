import java.util.*;

public class p03286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println(0);
            return;
        }
        Set<Integer> l = new HashSet<>();
        while (N != 0) {
            if (N > 0) {
                int r = plus(N);
                l.add(r);
                N -= (int)Math.pow(2, r);
            } else {
                int r = minus(N);
                l.add(r);
                N += (int)Math.pow(2, r);
            }
        }
        int[] s = new int[Collections.max(l)+1];
        for (int i = 0; i < s.length; i++) {
            if (l.contains(i)) {
                s[i] = 1;
            }
        }
        for (int i = s.length-1; i >= 0; i--) {
            System.out.print(s[i]);
        }
        System.out.println();
    }
    public static int plus(int N) {
        int p = 0;
        int n = 0;
        while (true) {
            p += (int)Math.pow(2, n);
            if (p >= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
    public static int minus(int N) {
        int p = 0;
        int n = 1;
        while (true) {
            p -= (int)Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
}