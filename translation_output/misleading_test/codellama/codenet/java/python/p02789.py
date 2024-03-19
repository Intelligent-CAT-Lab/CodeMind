<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3

Expected output:
Yes

```
import java.util.*;
public class p02789{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    if (n==m) {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
 
  }
}
```
[/INST]
```
import sys

n, m = map(int, sys.stdin.readline().split())

if n == m:
    print("Yes")
else:
    print("No")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `n, m = ...` unpacks the two integers from the list and assigns them to the variables `n` and `m`.
* The rest of the code is the same as the Java code, with the exception of the `print()` function, which is used in Python instead of `System.out.println()`.</s>
