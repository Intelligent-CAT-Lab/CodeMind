<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 10

Expected output:
3


```
import java.util.Scanner;
public class p02922 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}
```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

ans = (b - 1) // (a - 1)
if (b - 1) % (a - 1) == 0:
    print(ans)
else:
    print(ans + 1)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `a, b = ...` unpacks the list into two variables, `a` and `b`.
* `(b - 1) // (a - 1)` calculates the integer division of `b - 1` by `a - 1`.
* `if (b - 1) % (a - 1) == 0:` checks if the remainder of the division is 0.
* `print(ans)` or `print(ans + 1)` prints the result.</s>
