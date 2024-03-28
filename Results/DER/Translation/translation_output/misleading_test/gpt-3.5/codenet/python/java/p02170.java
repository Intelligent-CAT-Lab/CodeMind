```java
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = scanner.nextInt();
        int[] lst = new int[k+1];
        lst[k-1] = 1;
        int mod = 998244353;
        
        long A = (long) a * modPow(100 * n, mod - 2, mod) % mod;
        long inv = modPow(n, mod - 2, mod);
        
        for (int i = k - 2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = (int) ((A * (lst[i+1] - lst[i+n+1]) + lst[i+1]) % mod);
            } else {
                lst[i] = (int) ((A * (lst[i+1] - lst[k]) + (n - (k - i) + 1) * inv + lst[i+1]) % mod);
            }
        }
        
        int result = (lst[0] - lst[1]) % mod;
        if (result < 0) {
            result += mod;
        }
        
        System.out.println(result);
    }
    
    private static long modPow(long x, long y, int mod) {
        long res = 1;
        x = x % mod;
        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % mod;
            }
            y = y >> 1;
            x = (x * x) % mod;
        }
        return res;
    }
}
```
```
