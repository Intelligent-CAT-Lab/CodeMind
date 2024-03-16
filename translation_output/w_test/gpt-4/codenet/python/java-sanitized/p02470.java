import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02470 {

    public static List<Integer> primes(int n) {
        int rn = (int) Math.sqrt(n);
        int[] sieve = new int[rn + 1];
        for (int i = 2; i <= rn; i++) {
            sieve[i] = 1;
        }
        for (int i = 2; i <= rn; i++) {
            if (sieve[i] == 1) {
                for (int j = i * 2; j <= rn; j += i) {
                    sieve[j] = 0;
                }
            }
        }
        List<Integer> p = new ArrayList<>();
        for (int i = 2; i <= rn; i++) {
            if (sieve[i] == 1) {
                p.add(i);
            }
        }
        return p;
    }

    public static int phiFunc(int n, List<Integer> p) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> p = primes(n);
        System.out.println(phiFunc(n, p));
        scanner.close();
    }
}