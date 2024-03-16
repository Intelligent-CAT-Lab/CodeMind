import java.util.*;

public class p03769 {
    static List<Integer> fact = new ArrayList<>(Arrays.asList(1));

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            fact.add(fact.get(fact.size() - 1) * i);
        }

        public static int C(int a, int b) {
            return fact.get(a) / (fact.get(b) * fact.get(a - b));
        }

        public static int sC(int a, int b) {
            int ret = 0;
            for (int i = 1; i <= Math.min(b, a - b); i++) {
                ret += C(b, i) * C(a - b, i);
            }
            return ret;
        }

        public static List<String> calc(int n, int k) {
            if (n <= 0) {
                return new ArrayList<>();
            }
            int i = 0;
            while ((1 << (i + 1)) - 1 <= n) {
                i++;
            }

            List<String> ret = new ArrayList<>();
            ret.add(String.valueOf(k));
            int rem = n - ((1 << i) - 1);
            int kk = k + 1;
            i++;
            int j = i / 2;

            while (j > 0) {
                while (true) {
                    int tmp = sC(i, j);
                    if (tmp <= rem) {
                        ret.add(String.valueOf(kk));
                        ret.add(String.valueOf(kk));
                        kk++;
                        rem -= tmp;
                    } else {
                        break;
                    }
                }

                j--;
            }
            return ret.addAll(calc(rem, kk));
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(Arrays.toString(X.toArray()));
    }
}