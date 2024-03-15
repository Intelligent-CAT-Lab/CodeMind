```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int P = (int) Math.pow(10, 9) + 7;
        int[] X = new int[K + 1];
        long ans = 0;

        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += (long) X[i] * modPow(K / i, N, P);
        }

        System.out.println(ans % P);
    }

    private static long modPow(int base, int exponent, int modulus) {
        long result = 1;
        base %= modulus;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            exponent >>= 1;
            base = (base * base) % modulus;
        }

        return result;
    }
}
```
