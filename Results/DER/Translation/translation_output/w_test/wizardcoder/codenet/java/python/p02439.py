Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5 3

Expected output:
3 5


```
import java.util.*;
public class p02439 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(Math.min(min,c)+" "+Math.max(max,c));
    }
}

```

### Response:
```python
import sys

a, b, c = map(int, sys.stdin.readline().split())

min_ab = min(a, b)
max_ab = max(a, b)

print(min(min_ab, c), max(max_ab, c))
```

Explanation:

- We first import the `sys` module to read input from the standard input.
- We read the input values of `a`, `b`, and `c` using `map(int, sys.stdin.readline().split())`.
- We calculate the minimum and maximum values of `a` and `b` using `min()` and `max()` functions.
- We print the minimum and maximum values of `a` and `b` and `c` using `print()` function.<|endoftext|>
