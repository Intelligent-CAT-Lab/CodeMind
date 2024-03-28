<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
-41.43905052660632

```
import java.io.PrintStream;
import java.util.Scanner;
public class p03304 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        
        long s = d == 0 ? n : ((n - d) * 2);
        so.println((double) s/n/n*(m-1));
    }
}
```
[/INST]
```
import math

n = int(input())
m = int(input())
d = int(input())

s = d if d == 0 else (n - d) * 2
print((s / n / n) * (m - 1))
```
This code first prompts the user to input three integers, `n`, `m`, and `d`, using the `input()` function. It then calculates the value of `s` using the formula `s = d if d == 0 else (n - d) * 2`. Finally, it prints the result of the calculation `(s / n / n) * (m - 1)` to the console.

Note that the `input()` function in Python 3.x returns a string, so we need to convert it to an integer using the `int()` function.</s>
