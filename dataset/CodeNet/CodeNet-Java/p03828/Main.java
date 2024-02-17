import java.util.*;

public class Main {

    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final int[] ex = new int[1001];
        for (int i = 2; i <= n; i++) {
            final List<Map<Integer, Integer>> pfs = primeFactorize(i);
            for (Map<Integer, Integer> pf : pfs) {
                for (Map.Entry<Integer, Integer> e : pf.entrySet()) {
                    ex[e.getKey()] += e.getValue();
                }
            }
        }

        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= ex[i] + 1;
            ans %= MOD;
        }

        System.out.println(ans);
    }

    private static List<Map<Integer, Integer>> primeFactorize(int n) {
        final List<Map<Integer, Integer>> res = new ArrayList<>();
        for (int a = 2; a*a <= n; a++) {
            if (n % a != 0) {
                continue;
            }
            int ex = 0;
            while (n % a == 0) {
                ex++;
                n /= a;
            }
            res.add(Collections.singletonMap(a, ex));
        }
        if (n != 1) {
            res.add(Collections.singletonMap(n, 1));
        }
        return res;
    }
}
