```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int MOD = 1000000007;
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        long[] dpT = new long[N + 1];
        long[] dpF = new long[N + 1];
        
        // Initialize dpT and dpF
        dpT[0] = 1;
        dpF[0] = 0;
        
        for (int i = 0; i < M; i++) {
            long[] prevT = dpT.clone();
            long[] prevF = dpF.clone();
            dpT = new long[N + 1];
            dpF = new long[N + 1];
            
            // Red Red transitions
            for (int j = 0; j < N; j++) {
                dpT[j] = (dpT[j] + prevT[j + 1]) % MOD;
                dpF[j] = (dpF[j] + prevF[j + 1]) % MOD;
            }
            
            // Red Blue transitions
            for (int j = 1; j < N - 1; j++) {
                dpT[j] = (dpT[j] + prevF[j + 2]) % MOD;
                dpF[j] = (dpF[j] + prevF[j + 2]) % MOD;
            }
            
            dpT[0] = (dpT[0] + prevF[1]) % MOD;
            
            // Blue Red transitions
            for (int j = 1; j < N; j++) {
                dpT[j] = (dpT[j] + prevT[j + 1]) % MOD;
                dpF[j] = (dpF[j] + prevT[j + 1]) % MOD;
            }
            
            // Blue Blue transitions
            for (int j = 1; j < N; j++) {
                dpT[j] = (dpT[j] + prevT[j - 1]) % MOD;
                dpF[j] = (dpF[j] + prevF[j - 1]) % MOD;
            }
        }
        
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer = (answer + dpT[i]) % MOD;
        }
        
        System.out.println(answer);
    }
}
```
```
