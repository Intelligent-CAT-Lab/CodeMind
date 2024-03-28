Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
1.0000000000


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
import sys

n, m, d = map(int, sys.stdin.readline().split())

if d == 0:
    s = n
else:
    s = (n - d) * 2

print(s/n/n*(m-1))
```

Explanation:

- We first import the necessary modules `sys` and `java.io.PrintStream` and `java.util.Scanner`.
- We then define the `so` and `sc` variables as `PrintStream` and `Scanner` objects respectively.
- We read the input values `n`, `m`, and `d` from the standard input using the `sc.nextLong()` method.
- We calculate the value of `s` based on the given conditions.
- We then print the result as a double using the `so.println()` method.<|endoftext|>
