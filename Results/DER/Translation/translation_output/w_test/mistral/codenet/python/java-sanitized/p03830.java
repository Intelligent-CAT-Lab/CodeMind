import java.util.*;

public class p03830 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> factors = factorization(i);
            for (int k : factors) {
                d.put(k, d.getOrDefault(k, 0) + 1);
            }
        }
        int r = 1;
        for (int c : d.values()) {
            r *= (c + 1);
            r %= 1000000007;
        }
        System.out.println(r);
    }

    public static List<Integer> factorization(int n) {
        List<Integer> factors = new ArrayList<>();
        int c = 0;
        while (n % 2 == 0) {
            c++;
            n /= 2;
        }
        if (c > 0) {
            factors.add(2);
            c = 0;
        }
        int m = 3;
        while (m * m <= n) {
            c = 0;
            while (n % m == 0) {
                c++;
                n /= m;
            }
            if (c > 0) {
                factors.add(m);
                c = 0;
            }
            m += 2;
            if (m % 6 == 5) {
                m += 2;
            } else {
                m += 4;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}