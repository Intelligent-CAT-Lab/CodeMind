<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4 0 0 3 3

Expected output:
-59

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
    private static long[] fact;

    private static long factorial(int n) {
        if (fact[n] != 0) {
            return fact[n];
        } else {
            return fact[n] = (n <= 1) ? 1 : n * factorial(n - 1) % MOD;
        }
    }

    private static long comb(int x, int y) {
        return factorial(x) * pow((factorial(y) * factorial(x - y)) % MOD, MOD - 2) % MOD;
    }

    private static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
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

        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));

        long ans = 1;
        if (dx * 2 == w) {
            ans = ans * 2 % MOD;
        }
        if (dy * 2 == h) {
            ans = ans * 2 % MOD;
        }
        ans = ans * comb(dx + dy, dx) % MOD;

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the minimum distance `dx` and `dy`, and then calculates the answer using the combination formula. The answer is then printed out.

Please note that the `pow` function is used to calculate the modular inverse of `factorial(y) * factorial(x - y)` modulo `MOD`, which is needed to calculate the combination.
<|EOT|>
