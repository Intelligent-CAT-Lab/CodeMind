import java.util.*;

public class p03286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
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
        int[] s = new int[Math.max(l.size(), 1)];
        Arrays.fill(s, 0);
        for (int i = 1; i <= Math.max(l.size(), 1); i++) {
            if (l.contains(i)) {
                s[i] = 1;
            }
        }
        Arrays.reverse(s);
        System.out.println(Arrays.toString(s));
    }

    public static int plus(int N) {
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

    public static int minus(int N) {
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