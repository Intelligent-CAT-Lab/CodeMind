```java
import java.util.Scanner;

public class Main {
    
    static int mod = 1000000007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] result = findFibonacciProduct(k);
        System.out.println(result[0]);
    }
    
    public static int[] findFibonacciProduct(int k) {
        int l = 0;
        int r = k;
        while (r - l > 1) {
            int m = (l + r) / 2;
            if (m * (m + 1) < k) {
                l = m;
            } else {
                r = m;
            }
        }
        int b = l;
        
        int ad = k - (b * (b + 1));
        int d = ((ad - 1) % (b + 1)) + 1;
        
        int x = 2 * b + 1;
        int y = 1;
        if (ad - d > 0) {
            x += 1;
        }
        
        int dd;
        if (d <= (b + 1 + 1) / 2) {
            dd = d * 2 - 1;
        } else {
            int dz = (b + 1 - d);
            dd = dz * 2 + 2;
        }
        
        x -= (dd - 1);
        y += (dd - 1);
        
        long[] ans = fibonacci(x - 1, y - 1);
        int result = (int) (ans[0] % mod);
        
        return new int[] { result };
    }
    
    public static long[] fibonacci(int x, int y) {
        long[][] bt = {{1, 1}, {1, 0}};
        long[][] r = {{1, 1}, {1, 0}};
        while (x > 0) {
            if (x % 2 != 0) {
                r = multiplyMatrix(r, bt);
            }
            bt = multiplyMatrix(bt, bt);
            x /= 2;
        }
        
        return new long[] { r[0][0], r[1][0] };
    }
    
    public static long[][] multiplyMatrix(long[][] a, long[][] b) {
        int p = 2, q = 2, r = 2;
        long[][] res = new long[p][q];
        for (int s = 0; s < p; s++) {
            for (int t = 0; t < q; t++) {
                res[s][t] = 0;
                for (int u = 0; u < r; u++) {
                    long product = a[s][u] * b[u][t];
                    res[s][t] += product;
                    res[s][t] %= mod;
                }
            }
        }
        
        return res;
    }
}
``` 
