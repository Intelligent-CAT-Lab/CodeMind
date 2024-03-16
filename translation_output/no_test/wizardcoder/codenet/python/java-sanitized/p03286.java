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
        while (N!= 0) {
            if (N > 0) {
                int r = plus(N);
                l.add(r);
                N -= Math.pow(2, r);
            } else {
                int r = minus(N);
                l.add(r);
                N += Math.pow(2, r);
            }
        }
        int[] s = new int[l.size()];
        int i = 0;
        for (int j : l) {
            s[i++] = j;
        }
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        for (int j : s) {
            sb.append(j);
        }
        System.out.println(sb.toString());
    }

    public static int plus(int N) {
        int p = 0;
        int n = 0;
        while (true) {
            p += Math.pow(2, n);
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
            p -= Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
}