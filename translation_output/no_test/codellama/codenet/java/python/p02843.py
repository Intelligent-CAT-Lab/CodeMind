<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02843 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 100 <= x / 100 * 5) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}

Translate the above java code to python.

python code:

[/INST]
```
import sys

x = int(sys.stdin.readline())
if x % 100 <= x // 100 * 5:
    print(1)
else:
    print(0)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `int(x)` converts the string to an integer.
* `x % 100` calculates the remainder of `x` divided by 100.
* `x // 100` calculates the integer division of `x` by 100.
* `x // 100 * 5` calculates the integer division of `x` by 100 and then multiplies the result by 5.
* `if x % 100 <= x // 100 * 5:` checks if the remainder of `x` divided by 100 is less than or equal to the integer division of `x` by 100 multiplied by 5.
* `print(1)` prints the number 1 if the condition is true.
* `print(0)` prints the number 0 if the condition is false.</s>
