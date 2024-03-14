<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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
                res_v[k] = (1 + res_v_cumsum[k-1] - res_v[k-2]) % M;
                res_v_cumsum[k] = (res_v_cumsum[k-1] + res_v[k]) % M;
            }

            long result = ((res_v_cumsum[n-2] * (((n-1) * (n-1)) % M)) % M + ((res_v_cumsum[n-1] * (n-1)) % M) + n + (n-1)*(n-1)%M) % M;
            System.out.println(result);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and if the integer is 1, it prints 1. Otherwise, it calculates the sequence of integers and prints the result of a calculation based on the sequence. The calculation is done modulo 1,000,000,007 to prevent overflow.
<|EOT|>
