<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if A - (B * 2) > 0:
            system.out.println(A - (B * 2))
    }
}

Translate the above java code to python.

python Code:

[/INST]
```
import sys

A, B = map(int, sys.stdin.readline().split())

if A - (B * 2) > 0:
    print(A - (B * 2))
```
Explanation:

* `import sys` is used to import the `sys` module, which provides access to the standard input and output streams.
* `A, B = map(int, sys.stdin.readline().split())` is used to read a line of input from the standard input stream and split it into two integers. The `map()` function is used to convert the strings to integers.
* `if A - (B * 2) > 0:` is used to check if the difference between `A` and `B` is greater than 0.
* `print(A - (B * 2))` is used to print the result of the calculation.

Note: The `sys` module is not required in Python 3, as it is imported by default.</s>
