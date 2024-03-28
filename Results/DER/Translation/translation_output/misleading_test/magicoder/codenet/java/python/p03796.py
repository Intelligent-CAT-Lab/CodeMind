<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
-48

```
import java.util.*;
import java.lang.*;


public class p03796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double power = 1;
        for (int i = 1; i <= cnt; i++) {
            power = (power*i)%(Math.pow(10, 9) + 7);
        }
        System.out.println((int)power);
    }
}
```

@@ Response
```python
import sys

def main():
    cnt = int(sys.stdin.readline())
    power = 1
    for i in range(1, cnt + 1):
        power = (power * i) % (10**9 + 7)
    print(int(power))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the factorial of that integer modulo `10**9 + 7`, and then prints the result.<｜end▁of▁sentence｜>
