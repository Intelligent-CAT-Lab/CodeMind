<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    static final long MOD = 1000000007;

    static long modComb(int n, int a) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt *= (n - i);
            cnt *= pow(i + 1, MOD - 2, MOD);
            cnt %= MOD;
        }
        return cnt;
    }

    static long pow(long x, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * x) % mod;
            }
            x = (x * x) % mod;
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long X = pow(2, n, MOD) - 1;
        long A = modComb(n, a);
        long B = modComb(n, b);
        long ans = (X - A - B + MOD) % MOD;
        System.out.println(ans);
    }
}
```

Please note that Java does not have a built-in function to split a string into integers like Python's `map()` function. So, we use `Scanner` class to read the input. Also, Java does not have a built-in modulo exponentiation function like Python's `pow()` function. So, we implement a custom function `pow()` to calculate the modulo exponentiation.<｜end▁of▁sentence｜>
