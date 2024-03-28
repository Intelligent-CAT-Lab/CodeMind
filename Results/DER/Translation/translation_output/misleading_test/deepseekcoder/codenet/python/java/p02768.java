<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 1 3

Expected output:
-83

```
n,a,b = map(int, input().split())
MOD = 10**9 + 7

def modcomb(n,a,mod):
    cnt = 1
    for i in range(a):
        cnt *= (n-i)
        cnt *= pow(i+1,mod-2,mod)
        cnt %= mod
    # print(cnt)
    return cnt
    


X = pow(2,n,MOD)-1
A = modcomb(n,a,MOD)
B = modcomb(n,b,MOD)
ans = (X-A-B)%MOD
print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long MOD = (long) Math.pow(10, 9) + 7;

        long X = power(2, n, MOD) - 1;
        long A = modComb(n, a, MOD);
        long B = modComb(n, b, MOD);
        long ans = (X - A - B) % MOD;
        System.out.println(ans);
    }

    public static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    public static long modComb(int n, int r, long p) {
        long num = 1;
        for (int i = 0; i < r; i++) {
            num = (num * (n - i)) % p;
            num = (num * power(i + 1, p - 2, p)) % p;
        }
        return num;
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the modulo combination of `n` choose `a` and `n` choose `b`, and then calculates the result of the expression `(2^n - 1) - (n choose a) - (n choose b)` modulo `10^9 + 7`. The `power` method calculates `x` to the power `y` modulo `p`, and the `modComb` method calculates the modulo combination of `n` choose `r` modulo `p`.
<|EOT|>
