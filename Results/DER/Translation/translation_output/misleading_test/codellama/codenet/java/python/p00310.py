<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
66

```
import java.util.*;

public class p00310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        System.out.println(p + m + c);
    }
}


```
[/INST]
```
import sys

p, m, c = map(int, sys.stdin.readline().split())
print(p + m + c)
```
This code uses the `map` function to convert the input strings to integers, and then prints the sum of the three numbers.

The `sys.stdin.readline()` method is used to read a line of input from the standard input stream, and the `split()` method is used to split the line into a list of strings. The `map` function is then used to convert each string to an integer. Finally, the sum of the three integers is printed using the `print` function.</s>
