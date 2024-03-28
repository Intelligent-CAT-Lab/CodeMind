<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
9


```
A, B = map(int, input().split())

list = [A+B, 2*A-1, 2*B-1]
print(max(list))


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[] list = {A + B, 2 * A - 1, 2 * B - 1};
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.println(max);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the values for the list, and then prints the maximum value from the list.<｜end▁of▁sentence｜>
