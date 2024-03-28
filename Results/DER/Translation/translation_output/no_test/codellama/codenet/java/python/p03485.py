<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())
print((a + b + 1) // 2)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using whitespace as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `a, b = ...` unpacks the two integers from the list.
* `print((a + b + 1) // 2)` prints the result of the expression `(a + b + 1) // 2`, which is the average of `a` and `b`.

Note: The `//` operator is the floor division operator, which returns the integer part of the result of the division.</s>
