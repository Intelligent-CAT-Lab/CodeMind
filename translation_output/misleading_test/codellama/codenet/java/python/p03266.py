<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
-47

```
import java.util.*;

public class p03266 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    sc.close();

    if (K % 2 == 0) {
      long c1 = N / K;
      long c2 = N / (K / 2) - c1;
      System.out.println(c1 * c1 * c1 + c2 * c2 * c2);
    } else {
      long c = N / K;
      System.out.println(c * c * c);
    }

  }

}
```
[/INST]
```python
import sys

def main():
    N, K = map(int, sys.stdin.readline().split())
    if K % 2 == 0:
        c1 = N // K
        c2 = N // (K // 2) - c1
        print(c1 * c1 * c1 + c2 * c2 * c2)
    else:
        c = N // K
        print(c * c * c)

if __name__ == "__main__":
    main()
```
Note that in Python, the `//` operator is used for integer division, which returns the integer part of the result. The `%` operator is used for modulo division, which returns the remainder of the result.

Also, note that in Python, the `map` function is used to apply a function to each element of an iterable, and the `split` method is used to split a string into a list of substrings.

The `sys.stdin.readline()` method is used to read a line from standard input, and the `split` method is used to split the line into a list of substrings. The `map` function is then used to apply the `int` function to each substring, which converts the substrings to integers.

The `if __name__ == "__main__":` block is used to indicate that the code inside the block should only be executed if the file is run as a script, rather than being imported as a module.</s>
