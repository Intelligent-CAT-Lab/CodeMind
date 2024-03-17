<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4 0 0 3 3

Expected output:
2


```
from math import factorial
def comb (x,y):
	return factorial(x)//factorial(x-y)//factorial(y)

w,h,ax,ay,bx,by=map(int,input().split())
dx=min(w-abs(ax-bx),abs(ax-bx))
dy=min(h-abs(ay-by),abs(ay-by))
ans=1
if dx*2==w:ans*=2
if dy*2==h:ans*=2
ans*=comb(dx+dy,dx)
print(ans%100000007)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = 100000007;

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }

    private static long comb(int x, int y) {
        return (factorial(x) * modInv((int)factorial(x-y), MOD) % MOD * modInv((int)factorial(y), MOD) % MOD) % MOD;
    }

    private static long modInv(int a, int mod) {
        return power(a, mod-2, mod);
    }

    private static long power(long a, long b, long mod) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();
        scanner.close();

        int dx = Math.min(w-Math.abs(ax-bx), Math.abs(ax-bx));
        int dy = Math.min(h-Math.abs(ay-by), Math.abs(ay-by));

        long ans = 1;
        if (dx*2 == w) ans = (ans * 2) % MOD;
        if (dy*2 == h) ans = (ans * 2) % MOD;
        ans = (ans * comb(dx+dy, dx)) % MOD;

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the minimum distance `dx` and `dy`, and then calculates the answer using the combination formula. The answer is then printed out.
<|EOT|>
