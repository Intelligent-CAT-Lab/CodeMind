import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03769 {

    private static final int MAX = 101;
    private static long[] fact = new long[MAX];

    // Precompute factorials
    static {
        fact[0] = 1;
        for (int i = 1; i < MAX; i++) {
            fact[i] = fact[i - 1] * i;
        }
    }

    private static long C(int a, int b) {
        return fact[a] / (fact[b] * fact[a - b]);
    }

    private static long sC(int a, int b) {
        long ret = 0;
        for (int i = 0; i <= Math.min(b, a - b); i++) {
            ret += C(b, i) * C(a - b, i);
        }
        return ret;
    }

    private static List<Integer> calc(int n, int k) {
        List<Integer> ret = new ArrayList<>();
        if (n <= 0) {
            return ret;
        }
        int i = 0;
        while ((1 << (i + 1)) - 1 <= n) {
            i++;
        }

        for (int j = 0; j < i + 1; j++) {
            ret.add(k);
        }

        int rem = n - ((1 << i) - 1);
        int kk = k + 1;
        i++;
        int j = i / 2;

        while (j > 0) {
            while (true) {
                long tmp = sC(i, j);
                if (tmp <= rem) {
                    ret.add(j, kk);
                    ret.add(kk);
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
        scanner.close();

        List<Integer> X = calc(N, 1);
        System.out.println(X.size());
        for (int i = 0; i < X.size(); i++) {
            System.out.print(X.get(i));
            if (i < X.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}