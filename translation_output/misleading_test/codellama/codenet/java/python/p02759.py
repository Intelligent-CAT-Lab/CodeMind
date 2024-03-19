<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
-86

```
import java.util.*;

public class p02759 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.printf("%d", (N + 1) / 2);
    sc.close();
    return;
  }
}
```
[/INST]
```python
import sys

N = int(sys.stdin.readline())
print((N + 1) // 2)
```
Explanation:

* `sys.stdin.readline()` reads a line of input from the standard input stream.
* `int()` converts the input string to an integer.
* `(N + 1) // 2` calculates the average of `N` and `N + 1`.
* `print()` prints the result to the standard output stream.

Note: The `//` operator performs integer division and returns the integer part of the result, which is equivalent to rounding down to the nearest integer.</s>
