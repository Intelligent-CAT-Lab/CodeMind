<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 14

Expected output:
-21

```
import java.util.*;public class p03241{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int m=s.nextInt();for(int i=m/n;true;i--)if(m%i==0){System.out.print(i);break;}}}

```
[/INST]
```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    for i in range(m // n, 0, -1):
        if m % i == 0:
            print(i)
            break

if __name__ == "__main__":
    main()
```

Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using spaces as the delimiter.
* `map(int, ...)` converts the list of strings to a list of integers.
* `range(m // n, 0, -1)` creates a range of numbers from `m // n` to 0, with a step size of -1.
* `if m % i == 0:` checks if `m` is divisible by `i`.
* `print(i)` prints the first divisor found.
* `break` exits the loop.

Note: The `if __name__ == "__main__":` block is used to prevent the code from being executed when the file is imported as a module.</s>
