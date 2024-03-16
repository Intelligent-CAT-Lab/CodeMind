<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] g = new Integer[50];
        Integer[] h = new Integer[50];
        h[1] = 3;
        g[1] = 6;
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        for (int i = 2; i <= X; i++) {
            h[i] = g[i - 1] + 1;
            g[i] = 2 * h[i];
        }
        System.out.println(g[X]);
    }
}
```

This Java code does the same thing as the Python code. It initializes two arrays `g` and `h` with 50 elements, sets the second element of `h` to 3 and the second element of `g` to 6. It then reads an integer `X` from the user. It then iterates from 2 to `X`, setting the `i`th element of `h` to the `(i-1)`th element of `g` plus 1 and the `i`th element of `g` to 2 times the `i`th element of `h`. Finally, it prints the `X`th element of `g`.<｜end▁of▁sentence｜>
