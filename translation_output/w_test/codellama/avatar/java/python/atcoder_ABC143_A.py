<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
75 25

Expected output:
25

```
import java.util.*;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if A - (B * 2) > 0:
            system.out.println(A - (B * 2))
    }
}
```
[/INST]
```
import sys

A, B = map(int, sys.stdin.readline().split())

if A - (B * 2) > 0:
    print(A - (B * 2))
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of strings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `A, B = ...` unpacks the list of integers into two variables, `A` and `B`.
* `if A - (B * 2) > 0:` checks if the difference between `A` and `B` is greater than 0.
* `print(A - (B * 2))` prints the result of the subtraction.</s>
