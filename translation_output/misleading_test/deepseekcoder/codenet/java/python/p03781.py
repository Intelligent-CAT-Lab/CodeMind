<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
2

```
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}
```

### Response:
```python
def p03781():
    x = int(input())
    i = 1
    for i in range(1, x):
        if i * (i + 1) // 2 >= x:
            break
    print(i)

p03781()
```

In this Python code, we are using the same logic as the Java code. We are reading an integer input `x`, then we are iterating from `i=1` to `x`. For each `i`, we are checking if `i*(i+1)/2` is greater than or equal to `x`. If it is, we break the loop and print `i`.
<|EOT|>
