<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2

Expected output:
102

```
import java.util.*;

public class p03272 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        
        System.out.println(N-K+1);
    }
}

```
[/INST]
```
import sys

N, K = map(int, sys.stdin.readline().split())
print(N - K + 1)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `print()` prints the result to the standard output.

Note: The `sys` module is used to read from the standard input and write to the standard output. The `map()` function is used to apply a function to each element of a list.</s>
