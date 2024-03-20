Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = (int) Math.pow(10,9) + 7;

        int X = (int) Math.pow(2,n,MOD) - 1;
        int A = modcomb(n,a,MOD);
        int B = modcomb(n,b,MOD);
        int ans = (X-A-B)%MOD;
        System.out.println(ans);
    }

    public static int modcomb(int n, int a, int mod) {
        int cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt = (cnt * (n-i)) % mod;
            cnt = (cnt * pow(i+1,mod-2,mod)) % mod;
        }
        return cnt;
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
}
```<|endoftext|>
