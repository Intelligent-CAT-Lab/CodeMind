import java.util.*;

public class p03769 {
    static long[] fact = new long[101];

    static long C(int a, int b) {
        return fact[a] / (fact[b] * fact[a - b]);
    }

    static long sC(int a, int b) {
        long ret = 0;
        for (int i = Math.min(b, a - b) + 1; i >= 0; i--) {
            ret += C(b, i) * C(a - b, i);
        }
        return ret;
    }

    static List<String> calc(int n, int k) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        int i = 0;
        while ((1 << (i + 1)) - 1 <= n) {
            i++;
        }

        List<String> ret = new ArrayList<>(Collections.nCopies(i + 1, String.valueOf(k)));
        int rem = n - ((1 << i) - 1);
        int kk = k + 1;
        i++;
        int j = i / 2;

        while (j > 0) {
            while (true) {
                long tmp = sC(i, j);
                if (tmp <= rem) {
                    ret.add(j, String.valueOf(kk));
                    ret.add(String.valueOf(kk));
                    kk++;
                    rem -= tmp;
                } else {
                    break;
                }
            }
            j--;
        }

        ret.addAll(calc(rem, kk));
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        fact[0] = 1;
        for (int i = 1; i <= 100; i++) {
            fact[i] = fact[i - 1] * i;
        }

        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
}