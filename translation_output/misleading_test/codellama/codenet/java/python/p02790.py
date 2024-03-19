<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3400

```
import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b)
            for (int i = 0; i < a; i++)
                System.out.print(b);
        else
            for (int i = 0; i < b; i++)
                System.out.print(a);

    }
}

```
[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())

if a >= b:
    print(b * a)
else:
    print(a * b)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `a, b = ...` unpacks the two integers from the list and assigns them to the variables `a` and `b`.
* `if a >= b:` checks if `a` is greater than or equal to `b`.
* `print(b * a)` prints the product of `b` and `a` if `a` is greater than or equal to `b`.
* `else:` executes the code inside the `else` block if `a` is less than `b`.
* `print(a * b)` prints the product of `a` and `b` if `a` is less than `b`.</s>
