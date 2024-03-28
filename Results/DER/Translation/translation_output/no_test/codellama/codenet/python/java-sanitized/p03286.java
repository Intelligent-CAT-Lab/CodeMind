import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class p03286 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N == 0) {
            System.out.println(0);
            return;
        }
        Set<Integer> l = new HashSet<>();
        while (N != 0) {
            if (N > 0) {
                int r = plus(N);
                l.add(r);
                N -= (int) Math.pow(2, r);
            } else {
                int r = minus(N);
                l.add(r);
                N += (int) Math.pow(2, r);
            }
        }
        int[] s = new int[l.size()];
        int i = 0;
        for (Integer x : l) {
            s[i++] = x;
        }
        Arrays.sort(s);
        for (int x : s) {
            System.out.print(x);
        }
    }

    private static int plus(int N) {
        int p = 0;
        int n = 0;
        while (true) {
            p += (int) Math.pow(2, n);
            if (p >= N) {
                break;
            }
            n += 2;
        }
        return n;
    }

    private static int minus(int N) {
        int p = 0;
        int n = 1;
        while (true) {
            p -= (int) Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
}