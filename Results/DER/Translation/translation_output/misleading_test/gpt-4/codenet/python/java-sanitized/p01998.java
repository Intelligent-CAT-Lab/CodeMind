import java.util.Arrays;
import java.util.Scanner;

public class p01998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root = (int)Math.sqrt(n) + 1;
        boolean[] isPrime = new boolean[n + 3];
        Arrays.fill(isPrime, true); // Initially assume all numbers are prime

        for (int i = 4; i < n + 3; i += 2) {
            isPrime[i] = false; // Mark even numbers as not prime
        }

        int ans = 0;
        int prePrime = -1;
        for (int i = 3; i < n + 3; i += 2) {
            if (isPrime[i]) {
                if (prePrime + 2 == i) {
                    ans += 2; // Found twin primes
                }
                
                prePrime = i;
                if (i > root) {
                    continue;
                }
                for (int j = i * i; j < n + 3; j += i) {
                    isPrime[j] = false; // Mark multiples of i as not prime
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }
}