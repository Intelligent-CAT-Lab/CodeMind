import java.util.*;

public class p02624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    public static long solve(int n) {
        long soFar = 0;
        for (int i = 1; i <= n; i++) {
            int d = divCount(i);
            soFar += d * i;
        }
        return soFar;
    }

    public static int divCount(int n) {
        boolean[] hh = new boolean[n + 1];
        Arrays.fill(hh, true);
        int p = 2;
        while (p * p < n) {
            if (hh[p]) {
                for (int i = p * 2; i < n; i += p) {
                    hh[i] = false;
                }
            }
            p++;
        }
        int total = 1;
        for (int p1 = 2; p1 <= n; p1++) {
            if (hh[p1]) {
                int count = 0;
                if (n % p1 == 0) {
                    while (n % p1 == 0) {
                        n /= p1;
                        count++;
                    }
                    total *= (count + 1);
                }
            }
        }
        return total;
    }
}