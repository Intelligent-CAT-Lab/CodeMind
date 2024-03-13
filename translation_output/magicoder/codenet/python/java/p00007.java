<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
ans = 100000
for _ in range(int(input())):
    ans *= 1.05
    if ans % 1000:
        ans += 1000 - ans % 1000
print(int(ans))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ans = 100000;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println((int) ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then performs the same operations as the Python code. The `Scanner` class is used to read the input from the standard input. The `for` loop is used to repeat the operations a certain number of times. The `if` statement checks if the current value of `ans` is not a multiple of 1000, and if it's not, it adds the difference between 1000 and the remainder of `ans` divided by 1000 to `ans`. Finally, it prints the integer value of `ans`.<｜end▁of▁sentence｜>
