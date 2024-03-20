Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import math

a, b, c, d = map(int, input().split())

print(max(max(max(a * c, b * d), a * d), b * c))
```

Explanation:

- We first import the `math` module to use the `max()` function.
- We then read the input using `map()` function and store it in variables `a`, `b`, `c`, and `d`.
- We calculate the maximum of the four values using the `max()` function and print the result.<|endoftext|>
