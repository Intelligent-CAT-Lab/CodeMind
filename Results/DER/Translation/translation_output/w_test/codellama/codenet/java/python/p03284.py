<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 3

Expected output:
1


```
import java.util.*;

public class p03284{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        if(n%k == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
```
[/INST]
```
import sys

n, k = map(int, sys.stdin.readline().split())

if n % k == 0:
    print(0)
else:
    print(1)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `n, k = ...` unpacks the list into two variables, `n` and `k`.
* `if n % k == 0:` checks if `n` is divisible by `k`.
* `print(0)` or `print(1)` prints the corresponding value.</s>
