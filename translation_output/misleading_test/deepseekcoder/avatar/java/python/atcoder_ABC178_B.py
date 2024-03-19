<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
418379342 802780784 -790013317 -445130206

Expected output:
-186233282690604537

```
import java.util.*;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        System.out.println(Math.max(Math.max(Math.max(a * c, b * d), a * d), b * c));
    }
}
```

### Response:
```python
def atcoder_ABC178_B(a, b, c, d):
    return max(max(max(a * c, b * d), a * d), b * c)

# Test input
a = 418379342
b = 802780784
c = -790013317
d = -445130206

print(atcoder_ABC178_B(a, b, c, d))
```

This Python function takes four arguments (a, b, c, d) which are the four numbers given in the problem statement. It returns the maximum of the four possible products of the four numbers. The function uses the built-in `max` function to find the maximum of the four products.
<|EOT|>
