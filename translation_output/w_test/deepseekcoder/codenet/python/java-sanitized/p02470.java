import java.util.*;

public class p02470 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> primes = primes(n);
        System.out.println(phi_func(n, primes));
    }

    public static List<Integer> primes(int n) {
        int rn = (int)Math.sqrt(n);
        boolean[] sieve = new boolean[rn + 1];
        Arrays.fill(sieve, true);
        for (int i = 2; i <= rn; i++) {
            if (sieve[i]) {
                int j = i * 2;
                while (j <= rn) {
                    sieve[j] = false;
                    j += i;
                }
            }
        }
        List<Integer> p = new ArrayList<>();
        for (int i = 2; i <= rn; i++) {
            if (sieve[i]) {
                p.add(i);
            }
        }
        return p;
    }

    public static int phi_func(int n, List<Integer> p) {
        int ans = n;
        for (int q : p) {
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