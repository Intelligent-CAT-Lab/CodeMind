<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a, t, r = list(map(int, input().split()))
ans = r * t / a
print("{:.6f}".format(ans))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        int r = Integer.parseInt(input[2]);
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the result, and then prints the result with 6 decimal places.<｜end▁of▁sentence｜>
