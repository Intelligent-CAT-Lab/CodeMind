<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15

Expected output:
26

```
N = int(input())

ans = 0
for i in range(1, N + 1):
    if i % 5 != 0 and i % 3 != 0:
        ans += i

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
        scanner.close();

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 5 != 0 && i % 3 != 0) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}
```

You can test this code with the following test case:

Test input:
15

Expected output:
26<｜end▁of▁sentence｜>
