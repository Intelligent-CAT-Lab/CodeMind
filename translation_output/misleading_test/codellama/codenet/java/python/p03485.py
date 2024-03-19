<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
55

```
import java.util.Scanner;

public class p03485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solve(a, b));

        sc.close();
    }

    static int solve(int a, int b) {
        return (a + b + 1) / 2;
    }
}
```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())
print((a + b + 1) // 2)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `a, b = ...` unpacks the two integers from the list into separate variables `a` and `b`.
* `print((a + b + 1) // 2)` calculates the average of `a` and `b` and prints it to the standard output.

Note: The `//` operator performs integer division and returns the integer part of the result, while the `/` operator returns the floating-point result.</s>
