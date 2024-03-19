<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
40

```
N = int(input())
ans = 0
x = 1
while 2*x-1 <= N:
    x = 2*x
    ans += 1
print(ans)


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        int x = 1;
        while (2*x-1 <= N) {
            x = 2*x;
            ans += 1;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, initializes `ans` and `x` to 0 and 1, respectively, and then enters a loop. In each iteration of the loop, it doubles `x` and increments `ans` by 1. The loop continues until `2*x-1` is greater than `N`. After the loop, it prints the value of `ans`.<｜end▁of▁sentence｜>
