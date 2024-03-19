<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def solve(a, b):
    return (a + b + 1) // 2

a, b = map(int, input().split())
print(solve(a, b))
```

In this Python code, the function `solve` is equivalent to the `solve` method in the Java code. The `input().split()` function reads a line of input from the user and splits it into a list of strings, which are then converted to integers using the `map` function. The result is a tuple of two integers, which are unpacked into the variables `a` and `b`. The `solve` function is then called with these two integers as arguments. The result is printed to the console.
<|EOT|>
