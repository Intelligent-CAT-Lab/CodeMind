<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
    static final long MOD = (long)Math.pow(10,9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long X = power(2,n) - 1;
        long A = modComb(n,a);
        long B = modComb(n,b);
        long ans = (X - A - B) % MOD;

        System.out.println(ans);
    }

    public static long power(long x, long y) {
        long res = 1;
        x = x % MOD;
        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % MOD;
            y = y >> 1;
            x = (x * x) % MOD;
        }
        return res;
    }

    public static long modComb(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res %= MOD;
            res *= power(i + 1, MOD - 2);
            res %= MOD;
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the power of 2 modulo MOD, calculates combinations modulo MOD, and finally calculates the answer modulo MOD. The power function uses the binary exponentiation method to calculate the power modulo MOD, and the modComb function uses the combination formula with modulo MOD.
<|EOT|>
