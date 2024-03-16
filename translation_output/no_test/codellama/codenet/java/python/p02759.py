<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02759 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.printf("%d", (N + 1) / 2);
    sc.close();
    return;
  }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

N = int(sys.stdin.readline())
print((N + 1) // 2)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `int()` converts the string to an integer.
* `(N + 1) // 2` calculates the average of `N` and `N + 1` and rounds it down to the nearest integer.
* `print()` prints the result to the standard output.</s>
