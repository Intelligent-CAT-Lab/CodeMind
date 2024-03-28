<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
615

Expected output:
1


```
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
```
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

* `sys.stdin.readline()` reads a line of input from the standard input stream.
* `int(sys.stdin.readline())` converts the input to an integer.
* `x % 100` calculates the remainder of `x` divided by 100.
* `x // 100 * 5` calculates the result of `x` divided by 100, then multiplies it by 5.
* `if x % 100 <= x // 100 * 5:` checks if the remainder is less than or equal to the result of the division and multiplication.
* `print(1)` prints 1 if the condition is true.
* `print(0)` prints 0 if the condition is false.</s>
