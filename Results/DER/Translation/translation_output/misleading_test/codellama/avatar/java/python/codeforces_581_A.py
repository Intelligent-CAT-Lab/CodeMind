<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
45 99

Expected output:
-51 -57

```
import java.util.*;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;
        while (true) {
            if (a > 0 && b > 0) {
                count++;
                a--;
                b--;
            } else break;
        }
        int ans = a / 2 + b / 2;
        System.out.println(count + " " + ans);
    }
}
```
[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())
count = 0
while a > 0 and b > 0:
    count += 1
    a -= 1
    b -= 1
ans = a // 2 + b // 2
print(count, ans)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of strings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `a, b = ...` assigns the first two elements of the list to the variables `a` and `b`.
* `count = 0` initializes the variable `count` to 0.
* `while a > 0 and b > 0:` loops while both `a` and `b` are greater than 0.
* `count += 1` increments the variable `count` by 1.
* `a -= 1` decrements the variable `a` by 1.
* `b -= 1` decrements the variable `b` by 1.
* `ans = a // 2 + b // 2` calculates the sum of `a // 2` and `b // 2`.
* `print(count, ans)` prints the values of `count` and `ans` separated by a space.</s>
