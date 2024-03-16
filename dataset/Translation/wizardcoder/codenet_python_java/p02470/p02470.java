import java.util.*;

public class p02470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> p = primes(n);
        int ans = phi_func(n, p);
        System.out.println(ans);
    }

    public static List<Integer> primes(int n) {
        int rn = (int) Math.sqrt(n);
        boolean[] sieve = new boolean[rn + 1];
        Arrays.fill(sieve, true);
        for (int i = 2; i <= rn; i++) {
            if (sieve[i]) {
                for (int j = i * 2; j <= rn; j += i) {
                    sieve[j] = false;
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