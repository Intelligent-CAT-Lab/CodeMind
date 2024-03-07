<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = a;
        
        while (a >= b) {
            res += (a / b);
            a = (a / b) + (a % b);
        }
        
        System.out.println(res);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())
res = a

while a >= b:
    res += a // b
    a = a // b + a % b

print(res)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to an integer, and the `//` operator is used for integer division. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream, and the `split()` method is used to split the input into two integers. The `//` operator is used for integer division, and the `%` operator is used for modulo division. The `print()` function is used to print the result to the standard output stream.</s>
