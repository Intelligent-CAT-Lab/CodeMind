import java.util.*;

public class p03769 {
    static List<Long> fact = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < 101; i++) {
            if (i == 0) {
                fact.add(1L);
            } else {
                fact.add(fact.get(i - 1) * i);
            }
        }
        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }

    static long C(int a, int b) {
        return fact.get(a) / (fact.get(b) * fact.get(a - b));
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
        while ((1 << (i + 1)) - 1 <= n) {
            i++;
        }

        for (int j = 0; j < i + 1; j++) {
            ret.add(String.valueOf(k));
        }

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
}