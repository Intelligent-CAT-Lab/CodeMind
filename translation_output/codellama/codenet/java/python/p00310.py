<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```
import sys

p, m, c = map(int, sys.stdin.readline().split())
print(p + m + c)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings, where each string is a number.
* `map(int, ...)` applies the `int()` function to each string in the list, which converts it to an integer.
* `print(p + m + c)` prints the sum of `p`, `m`, and `c`.</s>
