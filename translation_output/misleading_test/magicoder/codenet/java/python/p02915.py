<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
-46

```

import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        new p02915().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int ans = S * S* S;


        System.out.println(ans);
    }
}

```

@@ Response
```python
def p02915():
    S = int(input())
    ans = S * S * S
    print(ans)

p02915()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the cube of that integer, and then prints the result.<｜end▁of▁sentence｜>
