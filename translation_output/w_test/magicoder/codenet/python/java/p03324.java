<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 5

Expected output:
5


```
# coding: utf-8
D, N = map(int, input().split())
print(100 ** D * N if N != 100 else 100 ** D * (N + 1))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        if (N != 100) {
            System.out.println((int) Math.pow(100, D) * N);
        } else {
            System.out.println((int) Math.pow(100, D) * (N + 1));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, `D` and `N`, and then calculates `100^D * N` if `N` is not equal to 100, otherwise it calculates `100^D * (N + 1)`. The result is then printed to the standard output.<｜end▁of▁sentence｜>
