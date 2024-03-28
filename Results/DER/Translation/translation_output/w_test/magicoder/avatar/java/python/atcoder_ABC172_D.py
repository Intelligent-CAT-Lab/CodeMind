<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9995083

Expected output:
837779626111757


```
import java.util.Scanner;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i < n + 1; i++) {
            ans += (long) i * ((long) n / (long) i) * (((long) n / (long) i) + 1) / 2;
        }
        System.out.println(ans);
    }
}
```

@@ Response
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i * (n // i) * ((n // i) + 1) // 2
print(ans)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the sum of the products of all pairs of divisors of the number, and prints the result.<｜end▁of▁sentence｜>
