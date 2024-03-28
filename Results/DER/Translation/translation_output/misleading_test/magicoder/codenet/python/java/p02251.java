<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
25

```
n = int(input())
ans = 0
for x in (25, 10, 5, 1):
  ans += n // x
  n %= x
print(ans)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int x : new int[]{25, 10, 5, 1}) {
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, initializes a variable `ans` to 0, and then iterates over an array of integers `{25, 10, 5, 1}`. For each integer `x` in the array, it adds the integer division of `n` by `x` to `ans` and updates `n` to the remainder of the integer division of `n` by `x`. Finally, it prints the value of `ans`.<｜end▁of▁sentence｜>
