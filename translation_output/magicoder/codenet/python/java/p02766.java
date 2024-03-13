<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n,k = map(int, input().split())
i = 0

while n//k**i != 0:
    i += 1

print(i)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;

        while (n / Math.pow(k, i) != 0) {
            i++;
        }

        System.out.println(i);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, `n` and `k`, and then calculates the smallest integer `i` such that `n / k^i` is not equal to zero. The result is then printed to the console.<｜end▁of▁sentence｜>
