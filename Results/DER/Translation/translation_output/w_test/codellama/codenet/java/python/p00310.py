<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
40


```
import java.util.*;

public class p00310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        System.out.println(p + m + c);
    }
}


```
[/INST]
```
import sys

p, m, c = map(int, sys.stdin.readline().split())
print(p + m + c)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `print()` prints the result to the standard output.

Note: The `map()` function is used to apply a function to each element of an iterable (such as a list or a string). In this case, we are applying the `int()` function to each element of the list returned by `split()`.</s>
