import java.util.HashSet;
import java.util.Set;

public class p03286 {

    public static void main(String[] args) {
        int N = -9;
        System.out.println(main(N));
    }

    public static String main(int N) {
        if (N == 0) {
            return "0";
        }
        Set<Integer> l = new HashSet<>();
        while (N != 0) {
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
        int maxVal = l.stream().max(Integer::compareTo).orElse(0);
        int[] s = new int[maxVal + 1];
        for (int i = 0; i < maxVal + 1; i++) {
            if (l.contains(i)) {
                s[i] = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]);
        }
        return sb.toString();
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