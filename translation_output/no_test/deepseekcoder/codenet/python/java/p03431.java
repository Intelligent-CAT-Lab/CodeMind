<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n,k=map(int,input().split());p=998244353
r=range
f=[1]
for i in r(k):f+=[-~i*f[i]%p]
print(sum(f[-2]*pow(f[i]*f[-2-i],-1,p)for i in r(n-1,k))%p)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long p = 998244353;
        long[] f = new long[k+1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = (-~i * f[i-1]) % p;
        }
        long sum = 0;
        for (int i = n-1; i >= k; i--) {
            sum += (f[k-1] * pow(f[i] * f[k-1-i], p-2, p)) % p;
        }
        System.out.println(sum % p);
    }

    public static long pow(long a, long b, long m) {
        a %= m;
        long r = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                r = (r * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return r;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers `n` and `k` from the standard input, calculates the factorial of `k` modulo `998244353`, and then calculates the sum of the series modulo `998244353`. The `pow` function is used to calculate the modular inverse of a number.
<|EOT|>
