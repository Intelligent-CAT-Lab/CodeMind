import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03769 {
    static long[] fact = new long[101];

    static void calcFact() {
        fact[0] = 1;
        for (int i = 1; i <= 100; i++) {
            fact[i] = fact[i - 1] * i;
        }
    }

    static long C(int a, int b) {
        return fact[a] / (fact[b] * fact[a - b]);
    }

    static long sC(int a, int b) {
        long ret = 0;
        for (int i = 0; i <= Math.min(b, a - b); i++) {
            ret += C(b, i) * C(a - b, i);
        }
        return ret;
    }

    static List<String> calc(int n, int k) {
        List<String> ret = new ArrayList<>();
        if (n <= 0) {
            return ret;
        }
        int i = 0;
        while (Math.pow(2, i + 1) - 1 <= n) {
            i++;
        }
        for (int j = 0; j <= i; j++) {
            ret.add(String.valueOf(k));
        }
        int rem = n - ((int) Math.pow(2, i)) + 1;
        int kk = k + 1;
        int j = i / 2;
        while (j > 0) {
            while (true) {
                long tmp = sC(i + 1, j);
                if (tmp <= rem) {
                    ret.add(j, String.valueOf(kk));
                    ret.add(String.valueOf(kk));
                    kk += 1;
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
        calcFact();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
}