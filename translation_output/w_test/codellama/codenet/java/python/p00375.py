<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
68

Expected output:
19


```

import java.util.Scanner;

class p00375
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((a - 30) / 2);
    }

}


```
[/INST]
```
import sys

a = int(sys.stdin.readline())
print((a - 30) // 2)
```
Explanation:

* `sys.stdin.readline()` reads a line of input from the standard input stream.
* `int()` converts the input string to an integer.
* `print()` prints the result to the standard output stream.
* `(a - 30) // 2` calculates the result of the expression and prints it to the standard output stream.

Note: The `//` operator performs integer division and returns the integer part of the result, which is equivalent to rounding down to the nearest integer.</s>
