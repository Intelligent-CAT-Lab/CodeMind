import java.util.*;

public class p03769 {
    static List<Integer> fact = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        fact.add(1);
        for (int i = 1; i < 101; i++) {
            fact.add(fact.get(i - 1) * i);
        }
        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }

    static int C(int a, int b) {
        return fact.get(a) / (fact.get(b) * fact.get(a - b));
    }

    static int sC(int a, int b) {
        int ret = 0;
        for (int i = Math.min(b, a - b) + 1; i > 0; i--) {
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
            i += 1;
        }
        ret.add(String.valueOf(k));
        int rem = n - ((1 << i) - 1);
        int kk = k + 1;
        i += 1;
        int j = i / 2;
        while (j > 0) {
            while (true) {
                int tmp = sC(i, j);
                if (tmp <= rem) {
                    ret.add(0, String.valueOf(kk));
                    ret.add(String.valueOf(kk));
                    kk += 1;