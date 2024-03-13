<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    res = a

    while a >= b:
        res += a // b
        a = a // b + a % b

    print(res)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, `a` and `b`, and then calculates the result `res`. The while loop continues until `a` is less than `b`. Inside the loop, `res` is incremented by the integer division of `a` by `b`, and `a` is updated to be the integer division of `a` by `b` plus the remainder of `a` divided by `b`. Finally, the result `res` is printed to the standard output.<｜end▁of▁sentence｜>
