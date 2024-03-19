<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
Possibli

```
import java.util.Scanner;

public class p03657 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) System.out.println("Possible");
        else System.out.println("Impossible");
    }
}
```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* The `if` statement checks if any of the following conditions are true:
	+ `a % 3 == 0` (i.e., `a` is divisible by 3)
	+ `b % 3 == 0` (i.e., `b` is divisible by 3)
	+ `(a + b) % 3 == 0` (i.e., the sum of `a` and `b` is divisible by 3)
* If any of the conditions are true, the program prints "Possible". Otherwise, it prints "Impossible".</s>
