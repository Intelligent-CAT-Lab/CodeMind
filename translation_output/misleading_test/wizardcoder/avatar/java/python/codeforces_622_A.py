Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
99992

Expected output:
344

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforces_622_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n1 = Long.parseLong(br.readLine());
        long n = (long) ((Math.sqrt(1 + (8 * n1)) - 1) / 2);
        long ans = n1 - (((n + 1) * n) / 2);
        System.out.print((ans!= 0)? ans : n);
    }
}
```

### Response:
```python
import math

n1 = int(input())
n = int((math.sqrt(1 + (8 * n1)) - 1) / 2)
ans = n1 - (((n + 1) * n) // 2)
print(ans if ans!= 0 else n)
```

Explanation:

- We first import the `math` module to use the `sqrt()` function.
- We read the input `n1` as an integer using the `input()` function.
- We calculate the square root of `1 + (8 * n1)` using the `sqrt()` function and subtract `1` to get the value of `n`.
- We calculate the value of `ans` as `n1 - (((n + 1) * n) / 2)`.
- We print the value of `ans` if it is not equal to `0`, otherwise we print the value of `n`.<|endoftext|>
