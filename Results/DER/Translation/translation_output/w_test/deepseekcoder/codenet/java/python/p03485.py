<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
2


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

In this Python code, the function `solve` is equivalent to the `solve` method in the Java code. The `map` function is used to convert the input string to integers. The `//` operator is used for integer division in Python. The input is read from the standard input using the `input().split()` function, which splits the input into a list of strings. The `map` function is then used to convert these strings to integers. The `print` function is used to output the result.
<|EOT|>
