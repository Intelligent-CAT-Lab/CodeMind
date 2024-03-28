<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 4 3

Expected output:
38

```
import java.util.*;

public class p02951 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          if(b + c < a){
              System.out.println(0);
          } else {
            System.out.println(b + c - a);
          }
        }
    }
```
[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())

if b + c < a:
    print(0)
else:
    print(b + c - a)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* The `if` statement checks if the sum of `b` and `c` is less than `a`. If it is, it prints `0`. Otherwise, it prints the difference between the sum of `b` and `c` and `a`.

Note: The `sys` module is used to read from the standard input, and the `map()` function is used to apply the `int()` function to each element of the list.</s>
