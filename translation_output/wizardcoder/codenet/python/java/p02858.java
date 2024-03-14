Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from fractions import gcd
H,W,T=map(int, input().split())
gh, gw = gcd(H, T), gcd(W, T)
h, w = H // gh, W // gw
MOD = 1000000007
print(pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD))
```

### Response:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
        int gh = gcd(H, T);
        int gw = gcd(W, T);
        int h = H / gh;
        int w = W / gw;
        BigInteger MOD = BigInteger.valueOf(1000000007);
        BigInteger result = pow(pow(2, h, MOD)
               .add(pow(2, w, MOD))
               .add(pow(2, gcd(h, w), MOD))
               .subtract(BigInteger.valueOf(3)), gh * gw, MOD);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static BigInteger pow(BigInteger a, int b, BigInteger mod) {
        BigInteger result = BigInteger.ONE;
        while (b > 0) {
            if (b % 2 == 1) {
                result = result.multiply(a).mod(mod);
            }
            a = a.multiply(a).mod(mod);
            b /= 2;
        }
        return result;
    }
}
```<|endoftext|>
