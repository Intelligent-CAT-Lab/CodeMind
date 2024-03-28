<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
111

Expected output:
178

```
import java.util.*;
public class p03243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i < 1000; i++) {
            if (i % 111 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
```
[/INST]
```python
import sys

n = int(sys.stdin.readline().strip())

for i in range(n, 1000):
    if i % 111 == 0:
        print(i)
        break
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `strip()` removes any leading or trailing whitespace from the string.
* `int()` converts the string to an integer.
* `range(n, 1000)` generates a sequence of numbers from `n` to 999.
* `if i % 111 == 0:` checks if `i` is divisible by 111.
* `print(i)` prints the number if it is divisible by 111.
* `break` exits the loop if a number is found that is divisible by 111.</s>
