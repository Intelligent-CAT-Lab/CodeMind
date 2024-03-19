<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
17
0
11
28
59
51
132
258
526
929

```
import java.util.*;

class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```
[/INST]
```
import sys

r, d, x = map(int, sys.stdin.readline().split())

for i in range(10):
    x = r * x - d
    print(x)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `range(10)` generates a list of numbers from 0 to 9.
* `for i in range(10):` loops over the list of numbers.
* `x = r * x - d` updates the value of `x` using the formula provided in the problem statement.
* `print(x)` prints the updated value of `x` to the standard output.</s>
