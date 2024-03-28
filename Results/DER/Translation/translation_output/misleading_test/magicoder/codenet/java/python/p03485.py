<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
55

```
import java.util.Scanner;

public class p03485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solve(a, b));

        sc.close();
    }

    static int solve(int a, int b) {
        return (a + b + 1) / 2;
    }
}
```

@@ Response
```python
def solve(a, b):
    return (a + b + 1) // 2

a, b = map(int, input().split())
print(solve(a, b))
```

In this Python code, we define a function `solve` that takes two integers as input and returns the result of the operation `(a + b + 1) // 2`. We then take two integers as input from the user, split them into two integers using the `split` function, and pass them to the `solve` function. The result is then printed.<｜end▁of▁sentence｜>
