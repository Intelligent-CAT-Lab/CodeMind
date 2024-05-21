import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p02032 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        Map<Integer, Integer> primeFactorization = primeFactorization(n);
        int count = primeFactorization.size();
        int ways = 1;
        for (int value : primeFactorization.values()) {
            ways *= (value + 1);
        }
        System.out.println(count + " " + (ways - 1));
    }

    private static Map<Integer, Integer> primeFactorization(int n) {
        Map<Integer, Integer> primeFactorization = new HashMap<>();
        if (n <= 1) {
            return primeFactorization;
        }

        int numSqrt = (int) Math.sqrt(n);
        boolean[] isPrime = new boolean[numSqrt + 1];
        for (int i = 2; i <= numSqrt; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= numSqrt; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j <= numSqrt; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= numSqrt; i++) {
            if (isPrime[i]) {
                while (n % i == 0) {
                    primeFactorization.put(i, primeFactorization.getOrDefault(i, 0) + 1);
                    n /= i;
                }
            }
        }
        if (n!= 1) {
            primeFactorization.put(n, primeFactorization.getOrDefault(n, 0) + 1);
        }
        return primeFactorization;
    }
}