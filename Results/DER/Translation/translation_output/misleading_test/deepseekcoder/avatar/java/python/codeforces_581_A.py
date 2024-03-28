<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    count = 0
    while True:
        if a > 0 and b > 0:
            count += 1
            a -= 1
            b -= 1
        else:
            break
    ans = a // 2 + b // 2
    print(count, ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, counts how many times it can subtract 1 from both of them until one of them becomes 0, and then calculates the remaining half of the numbers. The result is printed to the standard output.
<|EOT|>
