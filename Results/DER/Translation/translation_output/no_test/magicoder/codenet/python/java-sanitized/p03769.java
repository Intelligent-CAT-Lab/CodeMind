import java.util.*;

public class p03769 {
    static ArrayList<Long> fact = new ArrayList<>();

    static long C(int a, int b) {
        return fact.get(a) / (fact.get(b) * fact.get(a - b));
    }

    static long sC(int a, int b) {
        long ret = 0;
        for (int i = Math.min(b, a - b) + 1; i >= 0; i--) {
            ret += C(b, i) * C(a - b, i);
        }
        return ret;
    }

    static ArrayList<String> calc(int n, int k) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        int i = 0;
        while ((1 << (i + 1)) - 1 <= n) {
            i++;
        }

        ArrayList<String> ret = new ArrayList<>(Collections.nCopies(i + 1, String.valueOf(k)));
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

        ArrayList<String> sub = calc(rem, kk);
        ret.addAll(sub);
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fact.add(1L);
        for (int i = 1; i <= 100; i++) {
            fact.add(fact.get(i - 1) * i);
        }

        ArrayList<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
}