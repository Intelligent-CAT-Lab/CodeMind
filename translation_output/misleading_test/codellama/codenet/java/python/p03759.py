<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 4 6

Expected output:
YE

```
import java.util.Scanner;

public class p03759 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a-b == b-c) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
```
[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())

if a - b == b - c:
    print("YES")
else:
    print("NO")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `a, b, c = ...` unpacks the list of integers into separate variables `a`, `b`, and `c`.
* `if a - b == b - c:` checks if the difference between `a` and `b` is equal to the difference between `b` and `c`.
* `print("YES")` prints the string "YES" if the condition is true.
* `else:` is the else clause of the if statement.
* `print("NO")` prints the string "NO" if the condition is false.</s>
