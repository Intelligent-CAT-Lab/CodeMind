```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        final int MOD = 1000000007;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        long ans = 1;
        int[] num = new int[0];

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

            if (i > 1) {
                int[] newArray = new int[num.length + 1];
                System.arraycopy(num, 0, newArray, 0, num.length);
                newArray[num.length] = i;
                num = newArray;
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
