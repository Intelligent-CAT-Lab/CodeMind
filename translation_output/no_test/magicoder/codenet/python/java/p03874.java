<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
import sys
input = sys.stdin.readline

k = int(input())

n = 512
pattern = 0
a = []
for i in range(n):
    val = math.factorial(7 + i) // math.factorial(i) // math.factorial(7)
    a.append(val)
a.reverse()

cnt = 600 * 7 
ans = ["FESTIVA" for _ in range(n)]
for i, item in enumerate(a):
    ans[i] += ("L" * (k // item))
    k %= item
ans.reverse()
print("".join([str(item) for item in ans]))
```

@@ Response
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int n = 512;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = factorial(7 + i).divide(factorial(i).divide(factorial(7)));
            a[i] = val.intValue();
        }
        Arrays.sort(a);

        int cnt = 600 * 7;
        String[] ans = new String[n];
        Arrays.fill(ans, "FESTIVA");
        for (int i = 0; i < n; i++) {
            ans[i] += "L".repeat(k / a[i]);
            k %= a[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(ans[i]);
        }
        System.out.println(sb.toString());
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates factorials, and performs the same operations as in the Python code. The only difference is that Java uses BigInteger for factorials, which can handle larger numbers than Python's int type.<｜end▁of▁sentence｜>
