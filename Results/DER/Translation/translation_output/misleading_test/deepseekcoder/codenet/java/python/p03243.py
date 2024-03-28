<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
111

Expected output:
178

```
import java.util.*;
public class p03243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i < 1000; i++) {
            if (i % 111 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
```

### Response:
```python
def p03243(n):
    for i in range(n, 1000):
        if i % 111 == 0:
            return i

# Test input
print(p03243(111))
```

This Python function will return the smallest number that is a multiple of 111 and is greater than or equal to the input number.
<|EOT|>
