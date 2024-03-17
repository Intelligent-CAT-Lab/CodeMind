<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 4

Expected output:
7


```
n,k=map(int,input().split());p=998244353
r=range
f=[1]
for i in r(k):f+=[-~i*f[i]%p]
print(sum(f[-2]*pow(f[i]*f[-2-i],-1,p)for i in r(n-1,k))%p)
```

### Response:
Here is the Java version of the Python code:

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
            f[i] = -~i * f[i-1] % p;
        }
        long sum = 0;
        for (int i = n-1; i >= k; i--) {
            sum += f[k] * pow(f[i] * f[k-i] % p, p-2, p) % p;
        }
        System.out.println(sum % p);
    }

    public static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                result = result * a % m;
            }
            a = a * a % m;
            b >>= 1;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the factorial of the first integer, and then calculates the sum of the factorials of the first integer and the second integer. The result is then printed out. The `pow` function is used to calculate the modular inverse of a number.
<|EOT|>
