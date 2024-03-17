<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 1 3

Expected output:
2


```
a, b, c, k = map(int, input().split())
ans = 0
ans += 1*( min(a, k) )
k -= min(a, k)
ans += 0*( min(b, k) )
k -= min(b, k)
ans += (-1)*( min(c, k) )
k -= min(c, k)
print(ans)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        ans += Math.min(a, k) * 1;
        k -= Math.min(a, k);
        ans += Math.min(b, k) * 0;
        k -= Math.min(b, k);
        ans += Math.min(c, k) * -1;
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the answer, and prints it. The multiplication by 1, 0, and -1 in the Java code corresponds to the multiplication by 1, 0, and -1 in the Python code.<｜end▁of▁sentence｜>
