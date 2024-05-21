import java.util.*;

public class p02470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> primes = new ArrayList<>();
        boolean[] sieve = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            sieve[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (sieve[i]) {
                for (int j = i*i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (sieve[i]) {
                primes.add(i);
            }
        }
        int result = n;
        for (int prime : primes) {
            if (n % prime == 0) {
                result = result * (prime - 1) / prime;
                while (n % prime == 0) {
                    n /= prime;
                }
            }
        }
        if (n > 1) {
            result = result * (n - 1) / n;
        }
        System.out.println(result);
    }
}