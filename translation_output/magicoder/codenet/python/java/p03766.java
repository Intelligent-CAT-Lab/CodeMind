<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

if n == 1:
    print(1)
else:
    res_v = [0]*(n + 1)
    res_v_cumsum = [0]*(n + 1)
    res_v[0] = 0
    res_v[1] = 1
    res_v[2] = 1
    res_v_cumsum[0] = 0
    res_v_cumsum[1] = 1
    res_v_cumsum[2] = 2

    M = 1000000007

    for k in range(3, n):
        res_v[k] = (1 + res_v_cumsum[k-1] - res_v[k-2]) % M
        res_v_cumsum[k] = (res_v_cumsum[k-1] + res_v[k]) % M
    #print(res_v)
    print((((res_v_cumsum[n-2] * (((n-1) * (n-1)) % M)) % M) + ((res_v_cumsum[n-1] * (n-1)) % M) + n + (n-1)*(n-1)%M) % M)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else {
            long[] res_v = new long[n + 1];
            long[] res_v_cumsum = new long[n + 1];
            res_v[0] = 0;
            res_v[1] = 1;
            res_v[2] = 1;
            res_v_cumsum[0] = 0;
            res_v_cumsum[1] = 1;
            res_v_cumsum[2] = 2;

            long M = 1000000007;

            for (int k = 3; k < n; k++) {
                res_v[k] = (1 + res_v_cumsum[k - 1] - res_v[k - 2]) % M;
                res_v_cumsum[k] = (res_v_cumsum[k - 1] + res_v[k]) % M;
            }
            //System.out.println(res_v);
            System.out.println((((res_v_cumsum[n - 2] * (((n - 1) * (n - 1)) % M)) % M) + ((res_v_cumsum[n - 1] * (n - 1)) % M) + n + (n - 1) * (n - 1) % M) % M);
        }
    }
}
```

Please note that in Java, we use `long` instead of `int` for variables that might hold large numbers. Also, the `%` operator in Java is used for modulo operation.<｜end▁of▁sentence｜>
