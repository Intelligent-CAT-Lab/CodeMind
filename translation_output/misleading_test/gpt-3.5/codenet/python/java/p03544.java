```java
import java.util.Scanner;

public class Fibonacci {
    
    public static int fib(int n) {
        int[] memo = new int[n];
        memo[0] = 2;
        memo[1] = 1;
        
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        
        return memo[n - 1];
    }
    
    public static void solve() {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        System.out.println(fib(N + 1));
        
        input.close();
    }
    
    public static void main(String[] args) {
        solve();
    }
}
```
