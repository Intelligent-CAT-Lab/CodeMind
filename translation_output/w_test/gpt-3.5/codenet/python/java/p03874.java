```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int k = scanner.nextInt();
        int n = 512;
        long[] a = new long[n];
        
        for (int i = 0; i < n; i++) {
            long val = factorial(7 + i) / (factorial(i) * factorial(7));
            a[i] = val;
        }
        
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
        }
        
        int cnt = 600 * 7;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] += "L".repeat(k / a[i]);
            k %= a[i];
        }
        
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ans[i]);
        }
    }
    
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
```
