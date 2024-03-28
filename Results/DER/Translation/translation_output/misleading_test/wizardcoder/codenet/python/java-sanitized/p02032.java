import java.util.*;

public class p02032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // cf. https://qiita.com/suecharo/items/14137fb74c26e2388f1f
        List<Integer> primeList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            primeList.add(i);
        }
        primeList.set(0, 0);
        primeList.set(1, 0);
        int numSqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= numSqrt; i++) {
            if (primeList.get(i)!= 0) {
                for (int j = i * 2; j <= n; j += i) {
                    primeList.set(j, 0);
                }
            }
        }
        List<Integer> primeList2 = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primeList.get(i)!= 0) {
                primeList2.add(i);
            }
        }

        // cf. https://atcoder.jp/contests/abc110/submissions/12688244
        Map<Integer, Integer> primeFactorization = new HashMap<>();
        for (int prime : primeList2) {
            int count = 0;
            while (n % prime == 0) {
                count++;
                n /= prime;
            }
            if (count > 0) {
                primeFactorization.put(prime, count);
            }
        }
        if (n > 1) {
            primeFactorization.put(n, 1);
        }

        int count = primeFactorization.size();
        int val = 1;
        for (int v : primeFactorization.values()) {
            val *= v + 1;
        }
        System.out.println(count + " " + (val - 1));
    }
}