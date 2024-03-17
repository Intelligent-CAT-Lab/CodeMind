Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
198 1.10

Expected output:
217


```
import java.util.*;

public class p02659 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble();
    long bb = (long)((double)100 * b + 0.1);
    long ans = (a * bb) / (long)100;
    System.out.println(ans);
  }
}
```

### Response:
```python
import math

a = int(input())
b = float(input())

bb = int(100 * b + 0.1)
ans = a * bb // 100

print(ans)
```

Explanation:

- We first import the `math` module to use the `ceil()` function.
- We take input for `a` and `b` using the `input()` function.
- We calculate `bb` as `(100 * b + 0.1)` using the `ceil()` function.
- We calculate `ans` as `(a * bb) / 100` using integer division.
- We print the result using the `print()` function.<|endoftext|>
