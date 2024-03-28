<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
512

Expected output:
YES


```
import java.util.*;

public class codeforces_55_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & (n - 1)) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
```
[/INST]
```
import sys

n = int(sys.stdin.readline())
if n & (n - 1) == 0:
    print("YES")
else:
    print("NO")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `int(str)` converts the string to an integer.
* `n & (n - 1)` is a bitwise AND operation that checks if the number is a power of 2.
* If the result is 0, then the number is a power of 2, and the output is "YES". Otherwise, the output is "NO".</s>
