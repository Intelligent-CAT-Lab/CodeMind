<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 6

Expected output:
12


```
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class atcoder_ABC124_A {
    public static void main(String[] args) throws Exception {
        System.out.println(solve());
    }

    private static int solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            return a * 2;
        } else if (a > b) {
            return a * 2 - 1;
        } else {
            return b * 2 - 1;
        }
    }
}
```

@@ Response
```python
def solve():
    a, b = map(int, input().split())
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1

print(solve())
```

This Python code does the same thing as the Java code. It reads two integers from the input, and then returns the maximum of the two multiplied by 2 if they are equal, or the larger one multiplied by 2 minus 1 if they are not.<｜end▁of▁sentence｜>
