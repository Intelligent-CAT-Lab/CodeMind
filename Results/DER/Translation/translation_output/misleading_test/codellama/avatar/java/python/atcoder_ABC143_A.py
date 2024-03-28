<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
75 25

Expected output:
-27

```
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
```
[/INST]
```
import sys

A, B = map(int, sys.stdin.readline().split())

if A - (B * 2) > 0:
    print(A - (B * 2))
```
This code reads two integers `A` and `B` from standard input using the `map` function to convert them to integers, and then calculates the difference between `A` and `B` multiplied by 2. If the result is greater than 0, it prints the result to standard output.

Note that in Python, the `map` function is used to apply a function to each element of an iterable, and the `split` method is used to split a string into a list of substrings. The `readline` method is used to read a line of input from standard input, and the `print` function is used to print the result to standard output.</s>
