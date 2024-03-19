<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
13

```
n,k=map(int,input().split())
print(k*(k-1)**(n-1))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(k * Math.pow(k - 1, n - 1));
    }
}
```

This Java code reads two integers from the standard input (console), calculates the expression `k*(k-1)^(n-1)` and prints the result. The `Math.pow` function is used to calculate the power of a number.<｜end▁of▁sentence｜>
