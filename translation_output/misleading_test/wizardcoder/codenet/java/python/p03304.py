Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
-41.43905052660632

```
import java.io.PrintStream;
import java.util.Scanner;
public class p03304 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        
        long s = d == 0? n : ((n - d) * 2);
        so.println((double) s/n/n*(m-1));
    }
}
```

### Response:
```python
import math

n, m, d = map(int, input().split())

if d == 0:
    s = n
else:
    s = (n - d) * 2

result = s / n / n * (m - 1)

print(result)
```

Explanation:

- We first import the `math` module to use the `sqrt()` function.
- We read the input values `n`, `m`, and `d` using the `input()` function and convert them to integers using the `map()` function.
- We check if `d` is equal to 0. If it is, we set `s` to `n`. Otherwise, we set `s` to `((n - d) * 2)`.
- We calculate the result by dividing `s` by `n` raised to the power of 2 and multiplying it by `(m - 1)`.
- We print the result using the `print()` function.<|endoftext|>
