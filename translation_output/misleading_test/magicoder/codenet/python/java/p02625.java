<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
69

```
n,m=map(int,input().split())
d=[1]*(n+1)
for i in range(n):
  d[i+1]=((m-i)*((m-n+i)*d[i]+i*d[i-1]*(m-i+1)))%(10**9+7)
print(d[-1])

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        long[] d = new long[n + 1];
        d[0] = 1;
        for (int i = 0; i < n; i++) {
            d[i + 1] = ((m - i) * ((m - n + i) * d[i] + i * d[i - 1] * (m - i + 1))) % (long) Math.pow(10, 9) + 7;
        }
        System.out.println(d[n]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `m` from the standard input, initializes an array `d` with `n+1` elements, and then calculates the value of `d[n]`. The result is printed to the standard output.<｜end▁of▁sentence｜>
