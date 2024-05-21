import java.util.*;

public class p02032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] primes = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i] == i) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = i;
                }
            }
        }
        Map<Integer, Integer> primeFactors = new HashMap<>();
        int num = n;
        while (num > 1) {
            int prime = primes[num];
            primeFactors.put(prime, primeFactors.getOrDefault(prime, 0) + 1);
            num /= prime;
        }
        int count = primeFactors.size();
        int ways = 1;
        for (int factor : primeFactors.values()) {
            ways *= (factor + 1);
        }
        System.out.println(count + " " + (ways - 1));
    }
}