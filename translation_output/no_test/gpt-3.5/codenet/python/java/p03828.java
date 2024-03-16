```java
import java.util.HashMap;
import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        final long MOD = (long) 1e9 + 7;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Integer, Integer> count = new HashMap<>();
        long ans = 1;
        int[] num = new int[N];

        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1) {
                    break;
                }
            }
            if (i != 1) {
                num[i - 2] = i;
                count.put(i, 1);
            }
        }

        for (int n : count.values()) {
            ans = (ans * (n + 1)) % MOD;
        }
        System.out.println(ans);
    }
}
```
