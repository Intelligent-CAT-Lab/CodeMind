import java.util.*;

public class p02032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // cf. https://qiita.com/suecharo/items/14137fb74c26e2388f1f
        List<Integer> primeList = makePrimeList(n);

        Map<Integer, Integer> primeFactorization = primeFactorization(n, primeList);

        int count = primeFactorization.size();
        int val = 1;
        for (int v : primeFactorization.values()) {
            val *= (v + 1);
        }
        System.out.println(count + " " + (val - 1));
    }

    private static List<Integer> makePrimeList(int num) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            primeList.add(i);
        }
        primeList.set(0, 0);
        primeList.set(1, 0);
        int numSqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= numSqrt; i++) {
            if (primeList.get(i)!= 0) {
                for (int j = i * i; j <= num; j += i) {
                    primeList.set(j, 0);
                }
            }
        }
        primeList.removeIf(i -> i == 0);
        return primeList;
    }

    private static Map<Integer, Integer> primeFactorization(int num, List<Integer> primeList) {
        Map<Integer, Integer> primeFactorization = new HashMap<>();
        for (int prime : primeList) {
            while (num % prime == 0) {
                if (primeFactorization.containsKey(prime)) {
                    primeFactorization.put(prime, primeFactorization.get(prime) + 1);
                } else {
                    primeFactorization.put(prime, 1);
                }
                num /= prime;
            }
        }
        if (num!= 1) {
            if (primeFactorization.containsKey(num)) {
                primeFactorization.put(num, primeFactorization.get(num) + 1);
            } else {
                primeFactorization.put(num, 1);
            }
        }
        return primeFactorization;
    }
}