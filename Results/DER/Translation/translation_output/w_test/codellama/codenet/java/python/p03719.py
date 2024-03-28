<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
Yes


```
import java.util.*;

public class p03719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = "No";
        if (a <= c && c <= b) result ="Yes";
        
        System.out.println(result);
      
    }
}

```
[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())

if a <= c <= b:
    print("Yes")
else:
    print("No")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* The `if` statement checks if `a` is less than or equal to `c` and `c` is less than or equal to `b`. If both conditions are true, it prints "Yes", otherwise it prints "No".

Note: The `sys` module is used to read from the standard input and write to the standard output. The `map()` function is used to apply a function to each element of a list.</s>
