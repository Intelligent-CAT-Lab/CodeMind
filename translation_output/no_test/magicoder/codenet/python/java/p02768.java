<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    static final long MOD = 1000000007;

    static long modComb(int n, int a) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt = (cnt * (n - i)) % MOD;
            cnt = (cnt * pow(i + 1, MOD - 2)) % MOD;
        }
        return cnt;
    }

    static long pow(long x, long y) {
        long res = 1;
        x = x % MOD;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % MOD;
            y = y >> 1;
            x = (x * x) % MOD;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        long X = pow(2, n) - 1;
        long A = modComb(n, a);
        long B = modComb(n, b);
        long ans = (X - A - B + MOD) % MOD;
        System.out.println(ans);
    }
}
```

Please note that Java does not have a built-in function for modular exponentiation, so we have to implement it manually. Also, Java does not have a built-in function for modular inverse, so we have to implement it manually as well.<｜end▁of▁sentence｜>
