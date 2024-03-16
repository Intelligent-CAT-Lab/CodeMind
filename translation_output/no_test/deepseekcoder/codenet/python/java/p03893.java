<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] g = new Integer[50];
        Integer[] h = new Integer[50];
        for (int i = 0; i < 50; i++) {
            g[i] = null;
            h[i] = null;
        }
        h[1] = 3;
        g[1] = 6;
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();
        for (int i = 2; i <= X; i++) {
            h[i] = g[i - 1] + 1;
            g[i] = 2 * h[i];
        }
        System.out.println(g[X]);
    }
}
```

This Java code does the same thing as your Python code. It initializes two arrays `g` and `h` of size 50 with `null` values. Then it sets `h[1]` to 3 and `g[1]` to 6. It then reads an integer `X` from the standard input. It then fills the `g` and `h` arrays with the values computed from the given formula. Finally, it prints the `X`th value of the `g` array.
<|EOT|>
