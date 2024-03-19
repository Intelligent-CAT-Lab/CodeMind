<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 12

Expected output:
73

```
import java.util.Scanner;
public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = A + B > 23 ? A + B - 24 : A + B;
        System.out.println(ans);
    }
}

```
[/INST]
```
import sys

A, B = map(int, sys.stdin.readline().split())
ans = A + B - 24 if A + B > 23 else A + B
print(ans)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `A + B - 24 if A + B > 23 else A + B` is a ternary expression that checks if `A + B` is greater than 23, and if so, subtracts 24 from it. If not, it simply adds `A` and `B`.
* `print(ans)` prints the result to the standard output.</s>
