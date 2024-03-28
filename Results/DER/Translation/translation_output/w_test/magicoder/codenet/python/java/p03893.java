<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
g = [None]*50
h = [None]*50
h[1] = 3
g[1] = 6
X= int(input())
for i in range(2, X+1):
    h[i] = g[i-1] + 1
    g[i] = 2*h[i]
print(g[X])

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int[] g = new int[50];
        int[] h = new int[50];
        h[1] = 3;
        g[1] = 6;
        for (int i = 2; i <= X; i++) {
            h[i] = g[i - 1] + 1;
            g[i] = 2 * h[i];
        }
        System.out.println(g[X]);
    }
}
```

This Java code does the same thing as the Python code. It initializes two arrays `g` and `h`, sets the values of `h[1]` and `g[1]`, reads an integer `X` from the standard input, and then calculates the values of `g[i]` and `h[i]` for `i` from 2 to `X`. Finally, it prints the value of `g[X]`.<｜end▁of▁sentence｜>
