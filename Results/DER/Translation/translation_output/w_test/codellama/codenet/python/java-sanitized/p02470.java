import java.util.Scanner;

public class p02470 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] primes = getPrimes(n);
        int phi = phiFunction(n, primes);
        System.out.println(phi);
    }

    private static int[] getPrimes(int n) {
        int rn = (int) Math.sqrt(n);
        boolean[] sieve = new boolean[rn + 1];
        for (int i = 2; i <= rn; i++) {
            sieve[i] = true;
        }
        for (int i = 2; i <= rn; i++) {
            if (sieve[i]) {
                for (int j = i * 2; j <= rn; j += i) {
                    sieve[j] = false;
                }
            }
        }
        int[] primes = new int[rn + 1];
        int count = 0;
        for (int i = 2; i <= rn; i++) {
            if (sieve[i]) {
                primes[count++] = i;
            }
        }
        return primes;
    }

    private static int phiFunction(int n, int[] primes) {
        int ans = n;
        for (int q : primes) {
            if (n % q == 0) {
                ans = ans * (q - 1) / q;
                while (n % q == 0) {
                    n /= q;
                }
            }
        }
        if (n > 1) {
            ans = ans * (n - 1) / n;
        }
        return ans;
    }

}