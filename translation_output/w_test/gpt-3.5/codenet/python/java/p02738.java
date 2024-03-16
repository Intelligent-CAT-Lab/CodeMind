```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        
        int l = n*3 + 1;
        long[][] d = new long[l][n*5];

        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            d[i] = add(mul(add(mul(d[i-3], k), roll(d[k], l, -1)), mul(roll(d[j], l, 1), j)), M);
        }

        long sum = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n*5; j++) {
                sum = add(sum, d[i][j]);
            }
        }

        System.out.println(sum % M);
    }

    public static long[] add(long[] a, long[] b, long M) {
        long[] res = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = (a[i] + b[i]) % M;
        }
        return res;
    }

    public static long[] mul(long[] a, long b, long M) {
        long[] res = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = (a[i] * b) % M;
        }
        return res;
    }

    public static long[] roll(long[] a, int l, int offset) {
        long[] res = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            int newIndex = (i + offset + l) % l;
            res[newIndex] = a[i];
        }
        return res;
    }
}
```
