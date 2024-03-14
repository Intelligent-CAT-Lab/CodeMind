<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = a;
        
        while (a >= b) {
            res += (a / b);
            a = (a / b) + (a % b);
        }
        
        System.out.println(res);
    }
}
```

### Response:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    res = a

    while a >= b:
        res += a // b
        a = (a // b) + (a % b)

    print(res)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the number of bottles of champagne that can be bought with the given number of bottles and the price of a bottle, and prints the result.
<|EOT|>
