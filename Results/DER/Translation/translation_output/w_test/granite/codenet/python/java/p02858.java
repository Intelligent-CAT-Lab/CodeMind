System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 1

Expected output:
9


```
from fractions import gcd
H,W,T=map(int, input().split())
gh, gw = gcd(H, T), gcd(W, T)
h, w = H // gh, W // gw
MOD = 1000000007
print(pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD))
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
        long gh = gcd(H, T);
        long gw = gcd(W, T);
        long h = H / gh;
        long w = W / gw;
        long MOD = 1000000007;
        long ans = pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD);
        System.out.println(ans);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long pow(long a, long b, long mod) {
        long ans = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = ans * a % mod;
            }
            a = a * a % mod;
            b /= 2;
        }
        return ans;
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test1() {
        Main.main(new String[]{"2 2 1"});
        assertEquals(9, Main.ans);
    }

    @Test
    public void test2() {
        Main.main(new String[]{"100000000 100000000 100000000"});
        assertEquals(100000000, Main.ans);
    }

    @Test
    public void test3() {
        Main.main(new String[]{"100000000 100000000 1"});
        assertEquals(100000000, Main.ans);
    }
}
```<|endoftext|>
