Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int mod = 998244353;

        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }

        int[] fact = new int[M + 1];
        int[] powm = new int[M + 1];
        int[] pown = new int[M + 1];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            powm[i] = (powm[i - 1] * (M + 1)) % mod;
            pown[i] = (pown[i - 1] * (N + 1)) % mod;
        }

        int[] inv_fact = new int[M + 1];
        inv_fact[M] = pow(fact[M], mod - 2);
        for (int i = M - 1; i >= 0; i--) {
            inv_fact[i] = (inv_fact[i + 1] * (i + 1)) % mod;
        }

        int ans = 0;
        for (int i = 0; i <= N; i++) {
            ans += Math.pow(-1, i) * C(N, i) * C(M, i) * fact[i] * powm[N - i] * pown[M - i];
            ans = (int) (ans % mod);
        }

        System.out.println(ans);
    }

    public static int pow(int n, int m) {
        if (m == 0) {
            return 1;
        }
