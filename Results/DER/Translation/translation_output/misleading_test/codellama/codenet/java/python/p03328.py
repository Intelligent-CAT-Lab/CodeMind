<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 13

Expected output:
98

```
import java.util.Scanner;

class p03328 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int n = b - a;
    System.out.println(n * (n + 1) / 2 - b);
  }
}

```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())
n = b - a
print(n * (n + 1) // 2 - b)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `n = b - a` calculates the difference between `b` and `a`.
* `n * (n + 1) // 2` calculates the sum of the first `n` positive integers.
* `- b` subtracts `b` from the sum.
* `print()` prints the result to the standard output.</s>
