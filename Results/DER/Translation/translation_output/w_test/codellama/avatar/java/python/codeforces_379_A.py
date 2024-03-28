<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
80 970

Expected output:
80


```
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
```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())
res = a

while a >= b:
    res += a // b
    a = a // b + a % b

print(res)
```
This code uses the `map` function to convert the input strings to integers, and the `//` operator to perform integer division. The `//` operator returns the integer part of the result, while the `%` operator returns the remainder. The `while` loop continues until `a` is less than or equal to `b`, and the `res` variable is incremented by the result of the integer division. Finally, the `print` function is used to output the result.</s>
