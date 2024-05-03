Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int U = 100000;
        boolean[] is_prime = new boolean[U+1];
        Arrays.fill(is_prime, true);
        is_prime[2] = true;
        is_prime[3] = true;
        for (int p = 3; p*p <= U; p += 2) {
            if (is_prime[p]) {
                for (int i = p*p; i <= U; i += 2*p) {
                    is_prime[i] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i <= U; i++) {
            if (is_prime[i]) {
                primes.add(i);
            }
        }
        int MM = 510;
        int M = 255;
        long[][] A = new long[MM][MM];
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][2*i] = primes[n/2+i];
                    A[n][2*i+1] = primes[MM+M-n/2-i];
                }
                for (int i = 1; i < M; i++) {
                    A[n][2*i] *= A[n][2*i-1];
                    A[n][2*i+1] *= A[n][2*i];
                }
                for (int i = 1; i < M-1; i++) {
                    A[n][2*i+1] += 1;
                }
            } else if
