```java
import java.util.Scanner;

public class MatrixExponentiation {
    
    public static long[][] matrixMultiply(long[][] a, long[][] b, long mod) {
        int n = a.length;
        long[][] result = new long[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                    result[i][j] %= mod;
                }
            }
        }
        
        return result;
    }
    
    public static long[][] matrixExponentiation(long[][] a, long e, long mod) {
        int n = a.length;
        long[][] result = new long[n][n];
        for (int i = 0; i < n; i++) {
            result[i][i] = 1;
        }
        
        long[][] t = new long[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(a[i], 0, t[i], 0, n);
        }
        
        while (e > 0) {
            if (e % 2 == 1) {
                result = matrixMultiply(result, t, mod);
            }
            t = matrixMultiply(t, t, mod);
            e /= 2;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int l = scanner.nextInt();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long m = scanner.nextLong();
        
        int firstDigit = String.valueOf(a).length();
        long tail = a + b * (l - 1);
        
        long lo = -1;
        long[][] state = {{0, a % m, 1}};
        
        for (int d = firstDigit; d < 19; d++) {
            long hi = Math.min((long) ((Math.pow(10, d) - 1 - a) / b), l - 1);
            long cnt = hi - lo;
            long[][] coe = {
                {(long) Math.pow(10, d) % m, 0, 0},
                {1, 1, 0},
                {0, b % m, 1}
            };
            
            coe = matrixExponentiation(coe, cnt, m);
            state = matrixMultiply(state, coe, m);
            
            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }
        
        System.out.println(state[0][0]);
        
        scanner.close();
    }
}
```
