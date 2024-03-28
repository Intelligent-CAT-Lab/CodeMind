<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
68

Expected output:
95

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
```python
import sys

def main():
    a = int(sys.stdin.readline().strip())
    print((a - 30) // 2)

if __name__ == "__main__":
    main()
```

Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `strip()` removes any leading or trailing whitespace from the string.
* `int()` converts the string to an integer.
* `print()` prints the result to the standard output.
* `//` is the integer division operator, which returns the integer part of the result.

Note: The `if __name__ == "__main__":` block is used to indicate that the `main()` function should be executed only when the script is run as a standalone program, and not when it is imported as a module.</s>
