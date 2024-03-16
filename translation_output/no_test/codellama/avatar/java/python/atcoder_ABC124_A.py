<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class atcoder_ABC124_A {
    public static void main(String[] args) throws Exception {
        System.out.println(solve());
    }

    private static int solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            return a * 2;
        } else if (a > b) {
            return a * 2 - 1;
        } else {
            return b * 2 - 1;
        }
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

def solve():
    a, b = map(int, sys.stdin.readline().split())
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1

print(solve())
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to an integer, and the `split` function is used to split the input into two integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `print` function is used to print the result of the `solve` function to the standard output stream.</s>
