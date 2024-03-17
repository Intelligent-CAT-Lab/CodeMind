<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1000000


```
import java.util.*;
 
public class p02853 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        if (X == 1 && Y == 1) {
            ans = 1000000;
        } else {
            if (X == 1) {
                ans += 300000;
            }
            if (Y == 1) {
                ans += 300000;
            }
            if (X == 2) {
                ans += 200000;
            }
            if (Y == 2) {
                ans += 200000;
            }
            if (X == 3) {
                ans += 100000;
            }
            if (Y == 3) {
                ans += 100000;
            }
        }
        System.out.println(ans);
    }
}

```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())
    ans = 0
    if X == 1 and Y == 1:
        ans = 1000000
    else:
        if X == 1:
            ans += 300000
        if Y == 1:
            ans += 300000
        if X == 2:
            ans += 200000
        if Y == 2:
            ans += 200000
        if X == 3:
            ans += 100000
        if Y == 3:
            ans += 100000
    print(ans)

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `sys` module to read input from stdin, and the `map` function to convert the input strings to integers. The rest of the code is similar to the Java code, with the exception of the `if` statements, which are written in a more concise way in Python.</s>
