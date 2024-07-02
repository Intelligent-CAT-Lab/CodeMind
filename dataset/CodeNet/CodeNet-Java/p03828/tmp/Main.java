import java.util.*;

public class Main {

    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
System.out.println("[INST]9;n;sc.nextInt();"+n);

        final int[] ex = new int[1001];
        for (int i = 2; i <= n; i++) {
            final List<Map<Integer, Integer>> pfs = primeFactorize(i);
            for (Map<Integer, Integer> pf : pfs) {
                for (Map.Entry<Integer, Integer> e : pf.entrySet()) {
System.out.println("[INST]15;None;pf.entrySet();"+pf.entrySet());
                    ex[e.getKey()] += e.getValue();
System.out.println("[INST]16;None;e.getKey();"+e.getKey());
System.out.println("[INST]16;None;e.getValue();"+e.getValue());
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
System.out.println("[INST]41;None;res.add(Collections.singletonMap(a, ex));"+res.add(Collections.singletonMap(a, ex)));
System.out.println("[INST]41;None;Collections.singletonMap(a, ex);"+Collections.singletonMap(a, ex));
        }
        if (n != 1) {
            res.add(Collections.singletonMap(n, 1));
System.out.println("[INST]44;None;res.add(Collections.singletonMap(n, 1));"+res.add(Collections.singletonMap(n, 1)));
System.out.println("[INST]44;None;Collections.singletonMap(n, 1);"+Collections.singletonMap(n, 1));
        }
        return res;
    }
}
