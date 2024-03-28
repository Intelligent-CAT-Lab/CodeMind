<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
130000


```
ans = 100000
for _ in range(int(input())):
    ans *= 1.05
    if ans % 1000:
        ans += 1000 - ans % 1000
print(int(ans))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double ans = 100000;
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if ((int) ans % 1000 != 0) {
                ans += 1000 - (int) ans % 1000;
            }
        }
        System.out.println((int) ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, initializes a variable `ans` with the value 100000, and then multiplies `ans` by 1.05 in a loop that runs `n` times, where `n` is the input integer. If `ans` is not a multiple of 1000, it adds the difference between 1000 and the remainder of `ans` divided by 1000 to `ans`. Finally, it prints the integer value of `ans`.<｜end▁of▁sentence｜>
