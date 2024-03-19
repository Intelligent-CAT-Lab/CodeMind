<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 5

Expected output:
4

```


a,b,x = [int(i) for i in input().split()]

d = a - b
n = max(0,(x - b)) // d
ans = x + n * b
print(ans % 1000000007)


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        int d = a - b;
        int n = Math.max(0, (x - b)) / d;
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the difference `d`, the number of times `b` can be added to `x` to reach a number greater than or equal to `b`, and then calculates the answer `ans`. The answer is then printed modulo `1000000007`.<｜end▁of▁sentence｜>
